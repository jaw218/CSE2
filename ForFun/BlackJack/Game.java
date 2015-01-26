import java.util.*;
public class Game {
	
	Playa p = new Playa();
	Dealer f = new Dealer();
	Scanner scan = new Scanner (System.in);
	boolean win = false;
	String q = "y";
	boolean r = true;
	String k = "y";
	int u = 0;
	
	
	ArrayList d = new ArrayList();
	
	
	public static void main (String args[])
	{
		Game game = new Game();
		game.makeDeck();
		game.play();
		
	}
	
	public void play()
	{
		r = true;
		while(win == false)
		{
		p.takeCard(loseCard());
		u++;
		if(u > 103)
		{
			endGame();
		}
		p.takeCard(loseCard());
		u++;
		if(u > 103)
		{
			endGame();
		}
		System.out.println("Your count is " + p.getCount());
		if(p.getCount() == 21)
		{
			System.out.println("You win!!!");
			q = "n";
		}
		while(q.equals("y"))
		{
			System.out.println("Do you want to hit?  (y/n)");
			q = scan.nextLine();
			if(q.equals("y"))
			{
				p.takeCard(loseCard());
				u++;
				if(u > 103)
				{
					endGame();
				}
				System.out.println("Your count is " + p.getCount());
				if(p.getCount() > 21)
				{
					System.out.println("You busted.");
					q = "n";
					
				}
				else if(p.getCount() == 21)
				{
					System.out.println("You win!!! Unless of course the dealer has 21.");
					q = "n";
				}
			}
			else if((!q.equals("y")) && (!q.equals("n")))
			{
				q = "y";
			}
			
		}
						f.takeCard(loseCard());
						u++;
						if(u > 103)
						{
							endGame();
						}
						f.takeCard(loseCard());
						u++;
						if(u > 103)
						{
							endGame();
						}
						System.out.println("The dealer's count is " + f.getCount());
		
				while (f.getCount() < 17)
				{
					System.out.println("He hits");
					f.takeCard(loseCard());
					u++;
					if(u > 103)
					{
						endGame();
					}
					System.out.println("The dealer's count is now " + f.getCount());
				}
				
				if((p.getCount() > 21) && (f.getCount() > 21))
				{
					System.out.println("Everybody busts!");
					r = true;
				}
				
				if(p.getCount() > 21)
				{
					System.out.println("You lose.");
					r = true;
				}
				else if(f.getCount() > 21)
				{
					System.out.println("The dealer busted.");
					r = true;
				}
				else if((f.getCardCount() > 4) && (f.getCount() <= 21))
				{
					System.out.println("You lose!!!");
					r = true;
				}
				else if((p.getCardCount() > 4) && (p.getCount() <= 21))
				{
					System.out.println("You win!!!");
					r = true;
				}
				
				else if(p.getCount() == f.getCount())
				{
					System.out.println("The dealer wins!!!");
					r = true;
				}
				else if(f.getCount() > p.getCount())
				{
					System.out.println("The dealer wins!!!");
					r = true;
				}
				else if(f.getCount() < p.getCount())
				{
					System.out.println("You win!!!");
					r = true;
				}
				
				
				while (r == true)
				{
					System.out.println("Do you want to play again? (y/n)");
					k = scan.nextLine();
					if(k.equals("y"))
					{
						q = "y";
						k = "y";
						win = false;
						r = false;
						p.setCardCount(0);
						p.setCount(0);
						p.clearHand();
						f.setCardCount(0);
						f.setCount(0);
						f.clearHand();
					}
					else if(k.equals("n"))
					{
						win = true;
						r = false;
						
					}
					else
					{
						r = true;
					}
				}

			}
		
		
			
		
	}
		public Card loseCard()
		{
			Card z = new Card();
			int x = ((int) (Math.random() * (d.size()) - 1));
			z = (Card)d.get(x);
			d.remove(x);
			return z;
		}
		
		public void endGame()
		{
			System.out.println("The deck is out of cards! Game over!");
			System.exit(0);
		}
	
		public void makeDeck()
		{
			Card card = new Card();
			Card aa = new Card();
			Card ab = new Card();
			Card ac = new Card();
			Card ad = new Card();
			Card ae = new Card();
			Card af = new Card();
			Card ag = new Card();
			Card ah = new Card();
			Card ai = new Card();
			Card aj = new Card();
			Card ak = new Card();
			Card al = new Card();
			Card am = new Card();
			
			Card an = new Card();
			Card ao = new Card();
			Card ap = new Card();
			Card aq = new Card();
			Card ar = new Card();
			Card as = new Card();
			Card at = new Card();
			Card au = new Card();
			Card av = new Card();
			Card aw = new Card();
			
			Card ax = new Card();
			Card ay = new Card();
			Card az = new Card();
			Card ba = new Card();
			Card bb = new Card();
			Card bc = new Card();
			Card bd = new Card();
			Card be = new Card();
			Card bf = new Card();
			Card bg = new Card();
			
			Card bh = new Card();
			Card bi = new Card();
			Card bj = new Card();
			Card bk = new Card();
			Card bl = new Card();
			Card bm = new Card();
			Card bn = new Card();
			Card bo = new Card();
			Card bp = new Card();
			Card bq = new Card();
			
			Card br = new Card();
			Card bs = new Card();
			Card bt = new Card();
			Card bu = new Card();
			Card bv = new Card();
			Card bw = new Card();
			Card bx = new Card();
			Card by = new Card();
			Card bz = new Card();
			Card ca = new Card();
			
			Card dz = new Card();
			Card cb = new Card();
			Card cc = new Card();
			Card cd = new Card();
			Card ce = new Card();
			Card cf = new Card();
			Card cg = new Card();
			Card ch = new Card();
			Card ci = new Card();
			Card cj = new Card();
			
			Card ck = new Card();
			Card cl = new Card();
			Card cm = new Card();
			Card cn = new Card();
			Card co = new Card();
			Card cp = new Card();
			Card cq = new Card();
			Card cr = new Card();
			Card cs = new Card();
			Card ct = new Card();
			
			Card cu = new Card();
			Card cv = new Card();
			Card cw = new Card();
			Card cx = new Card();
			Card cy = new Card();
			Card cz = new Card();
			Card da = new Card();
			Card db = new Card();
			Card dc = new Card();
			Card dd = new Card();
			
			Card de = new Card();
			Card df = new Card();
			Card dg = new Card();
			Card dh = new Card();
			Card di = new Card();
			Card dj = new Card();
			Card dk = new Card();
			Card dl = new Card();
			Card dm = new Card();
			Card dn = new Card();
			
			Card dp = new Card();
			Card dq = new Card();
			Card dr = new Card();
			Card ds = new Card();
			Card dt = new Card();
			Card du = new Card();
			Card dv = new Card();
			Card dw = new Card();
			Card dx = new Card();
			Card dy = new Card();
			
			card.makeCard(2, "2cx");
			d.add(card);
			aa.makeCard(2, "2hx");
			d.add(aa);
			ab.makeCard(2, "2sx");
			d.add(ab);
			ac.makeCard(2, "2dx");
			d.add(ac);
			ad.makeCard(2, "2cy");
			d.add(ad);
			ae.makeCard(2, "2hy");
			d.add(ae);
			af.makeCard(2, "2sy");
			d.add(af);
			ag.makeCard(2, "2dy");
			d.add(ag);
			
			ah.makeCard(3, "3cx");
			d.add(ah);
			ai.makeCard(3, "3hx");
			d.add(ai);
			aj.makeCard(3, "3sx");
			d.add(aj);
			ak.makeCard(3, "3dx");
			d.add(ak);
			al.makeCard(3, "3cy");
			d.add(al);
			am.makeCard(3, "3hy");
			d.add(am);
			an.makeCard(3, "3sy");
			d.add(an);
			ao.makeCard(3, "3dy");
			d.add(ao);
			
			ap.makeCard(4, "4cx");
			d.add(ap);
			aq.makeCard(4, "4hx");
			d.add(aq);
			ar.makeCard(4, "4sx");
			d.add(ar);
			as.makeCard(4, "4dx");
			d.add(as);
			at.makeCard(4, "4cy");
			d.add(at);
			au.makeCard(4, "4hy");
			d.add(au);
			av.makeCard(4, "4sy");
			d.add(av);
			aw.makeCard(4, "4dy");
			d.add(aw);
			
			ax.makeCard(5, "5cx");
			d.add(ax);
			ay.makeCard(5, "5hx");
			d.add(ay);
			az.makeCard(5, "5sx");
			d.add(az);
			ba.makeCard(5, "5dx");
			d.add(ba);
			bb.makeCard(5, "5cy");
			d.add(bb);
			bc.makeCard(5, "5hy");
			d.add(bc);
			bd.makeCard(5, "5sy");
			d.add(bd);
			be.makeCard(5, "5dy");
			d.add(be);
			
			bf.makeCard(6, "6cx");
			d.add(bf);
			bg.makeCard(6, "6hx");
			d.add(bg);
			bh.makeCard(6, "6sx");
			d.add(bh);
			bi.makeCard(6, "6dx");
			d.add(bi);
			bj.makeCard(6, "6cy");
			d.add(bj);
			bk.makeCard(6, "6hy");
			d.add(bk);
			bl.makeCard(6, "6sy");
			d.add(bl);
			bm.makeCard(6, "6dy");
			d.add(bm);
			
			bn.makeCard(7, "7cx");
			d.add(bn);
			bo.makeCard(7, "7hx");
			d.add(bo);
			bp.makeCard(7, "7sx");
			d.add(bp);
			bq.makeCard(7, "7dx");
			d.add(bq);
			br.makeCard(7, "7cy");
			d.add(br);
			bs.makeCard(7, "7hy");
			d.add(bs);
			bt.makeCard(7, "7sy");
			d.add(bt);
			bu.makeCard(7, "7dy");
			d.add(bu);
			
			bv.makeCard(8, "8cx");
			d.add(bv);
			bw.makeCard(8, "8hx");
			d.add(bw);
			bx.makeCard(8, "8sx");
			d.add(bx);
			by.makeCard(8, "8dx");
			d.add(by);
			bz.makeCard(8, "8cy");
			d.add(bz);
			ca.makeCard(8, "8hy");
			d.add(ca);
			cb.makeCard(8, "8sy");
			d.add(cb);
			cd.makeCard(8, "8dy");
			d.add(cd);
		
			ce.makeCard(9, "9cx");
			d.add(ce);
			cf.makeCard(9, "9hx");
			d.add(cf);
			cg.makeCard(9, "9sx");
			d.add(cg);
			ch.makeCard(9, "9dx");
			d.add(ch);
			ci.makeCard(9, "9cy");
			d.add(ci);
			cj.makeCard(9, "9hy");
			d.add(cj);
			ck.makeCard(9, "9sy");
			d.add(ck);
			cl.makeCard(9, "9dy");
			d.add(cl);

			cm.makeCard(10, "tcx");
			d.add(cm);
			cn.makeCard(10, "thx");
			d.add(cn);
			co.makeCard(10, "tsx");
			d.add(co);
			cp.makeCard(10, "tdx");
			d.add(cp);
			cq.makeCard(10, "tcy");
			d.add(cq);
			cr.makeCard(10, "thy");
			d.add(cr);
			cs.makeCard(10, "tsy");
			d.add(cs);
			ct.makeCard(10, "tdy");
			d.add(ct);
			
			cu.makeCard(10, "jcx");
			d.add(cu);
			cv.makeCard(10, "jhx");
			d.add(cv);
			cw.makeCard(10, "jsx");
			d.add(cw);
			cx.makeCard(10, "jdx");
			d.add(cx);
			cy.makeCard(10, "jcy");
			d.add(cy);
			cz.makeCard(10, "jhy");
			d.add(cz);
			da.makeCard(10, "jsy");
			d.add(da);
			db.makeCard(10, "jdy");
			d.add(db);
			
			dc.makeCard(10, "qcx");
			d.add(dc);
			dd.makeCard(10, "qhx");
			d.add(dd);
			de.makeCard(10, "qsx");
			d.add(de);
			df.makeCard(10, "qdx");
			d.add(df);
			dg.makeCard(10, "qcy");
			d.add(dg);
			dh.makeCard(10, "qhy");
			d.add(dh);
			di.makeCard(10, "qsy");
			d.add(di);
			dj.makeCard(10, "qdy");
			d.add(dj);
			
			
			dk.makeCard(10, "kcx");
			d.add(dk);
			dl.makeCard(10, "khx");
			d.add(dl);
			dm.makeCard(10, "ksx");
			d.add(dm);
			dn.makeCard(10, "kdx");
			d.add(dn);
			dp.makeCard(10, "kcy");
			d.add(dp);
			dq.makeCard(10, "khy");
			d.add(dq);
			dr.makeCard(10, "ksy");
			d.add(dr);
			ds.makeCard(10, "kdy");
			d.add(ds);
			
			dt.makeCard(11, "acx");
			d.add(dt);
			du.makeCard(11, "ahx");
			d.add(du);
			dv.makeCard(11, "asx");
			d.add(dv);
			dw.makeCard(11, "adx");
			d.add(dw);
			dx.makeCard(11, "acy");
			d.add(dx);
			dy.makeCard(11, "ahy");
			d.add(dy);
			cc.makeCard(11, "asy");
			d.add(cc);
			dz.makeCard(11, "ady");
			d.add(dz);	
		}

}

