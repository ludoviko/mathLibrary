package com.lam.mathematics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.statistics.Leader;

public class LeaderTest {
	Leader leader;
	
	@Before
	public void setUp() throws Exception {
		leader = new Leader();
	}

	@After
	public void tearDown() throws Exception {
		leader = null;
	}

	@Test
	public void testGoldenLeader() {
		Assert.assertEquals('a', leader.goldenLeader("aacaaa"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("dcdjx"));
		Assert.assertEquals('b', leader.goldenLeader("bcbbbbba"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabc"));
	}

	@Test
	public void testGoldenLeaderSystemTest() {
		Assert.assertEquals('a', leader.goldenLeader("aacaaa"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("dcdjx"));
		Assert.assertEquals('b', leader.goldenLeader("bcbbbbba"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("wc"));
		Assert.assertEquals('v', leader.goldenLeader("vv"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("mnaa"));
		Assert.assertEquals('r', leader.goldenLeader("rrrr"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("kkpppx"));
		Assert.assertEquals('i', leader.goldenLeader("iiiiii"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("wwdjdjdj"));
		Assert.assertEquals('z', leader.goldenLeader("zzzzbzzz"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("dkgjdnkjkg"));
		Assert.assertEquals('d', leader.goldenLeader("ddvdddvddd"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("hghmzhhhzghg"));
		Assert.assertEquals('p', leader.goldenLeader("ppprppppppuw"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("hllkchlqhklltt"));
		Assert.assertEquals('a', leader.goldenLeader("maaaaaacmaaaac"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("qqbqqqhiqwqhqhah"));
		Assert.assertEquals('j', leader.goldenLeader("jjjhhjhjjjvhjjjj"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("bfbfprrpbsbbbpbpbb"));
		Assert.assertEquals('v', leader.goldenLeader("tivvvovvovvvvvvtvv"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("jkznyyyzjzyzzzpzzkkk"));
		Assert.assertEquals('y', leader.goldenLeader("syfyrysydyyyyyyyygyy"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("eenbeeenenenbnnneeibbn"));
		Assert.assertEquals('g', leader.goldenLeader("fgpwgpggfpfgpfgggpgggg"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("ivddiddvivdbiiidiiddiiii"));
		Assert.assertEquals('r', leader.goldenLeader("jhrrrjjrjjrrjhrrrrjrjrrr"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("rkhrllllrrlhrhdhhhhhhrlhhr"));
		Assert.assertEquals('o', leader.goldenLeader("oyyyoowoooofwjoooooffyyooo"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("ttwwtuuuwwtttwttttwtwuwtuttu"));
		Assert.assertEquals('l', leader.goldenLeader("lrlllllllvrrvllwlwwrlrlvrlll"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("xyxxwzxyyyxybxxwxyxxbxsyxbyxbs"));
		Assert.assertEquals('q', leader.goldenLeader("qqqqqeqqueqqueuqqqqlqquqqqeeuq"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("pooopoupppppououooooooppupypppoo"));
		Assert.assertEquals('a', leader.goldenLeader("dddaadadaaaddddaadaaaadadaaaaada"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("uuddguuuuuuugdaagaduagguuuguugugug"));
		Assert.assertEquals('y', leader.goldenLeader("wyhheyyhyeiyyyyyhyyyyyhhyeyheyeehy"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("rqhrqhrqhrhrhhhhrqhhhqqhqhhhqqqqqhqh"));
		Assert.assertEquals('x', leader.goldenLeader("xxrxxxahxxxxaanxxhxxxhhnaxxxxeaxhxxx"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("bbonoooobobbnoobobooboobbobbbbooobobbo"));
		Assert.assertEquals('w', leader.goldenLeader("tktkwwttwwtwttwttwwwwwtwtwwwwwwttwttww"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("jjeejycjyjeccejejjyjeoewejjeejejwjejyjce"));
		Assert.assertEquals('s', leader.goldenLeader("kssslssssslkssslsssskllklsklssssslkslssl"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("jyjjkjjkjjykkkkyjyjkkkyjkykyjjkkjkjykkxjjk"));
		Assert.assertEquals('u', leader.goldenLeader("kuuukuuuuuukkkkuukukukuuuuukkuukkkkkuukuuk"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("crlgrrgrgrcgrgrrrcrrgdgcglrggrchgrdrrrrrgrgr"));
		Assert.assertEquals('o', leader.goldenLeader("aoaooaaoohoaaoaoooooohaohoaoaooooooaaoooaoah"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("vvvvvvlvllvlvvvlllvlvtsgllllsvllvgvlggvslvllvs"));
		Assert.assertEquals('d', leader.goldenLeader("ddddkkdkddkddkkkkddkdkddkdkkkkdddddkdkddddddkk"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("ovcoocvoocujovovccooocccooocucccoooccoccocococco"));
		Assert.assertEquals('u', leader.goldenLeader("uuppupupuuuppppuuupuuupuuuqpuuuuuupppuppppuuupup"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("pmpmpm"));
		Assert.assertEquals('z', leader.goldenLeader("aaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabbcc"));
		Assert.assertEquals('a', leader.goldenLeader("aacaa"));
		Assert.assertEquals('a', leader.goldenLeader("aaaaaab"));
		Assert.assertEquals('a', leader.goldenLeader("aaabb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaaaahyhahhytaaratyuiiiaaikjhaahttaghyjaajuiokbvf"));
		Assert.assertEquals('a', leader.goldenLeader("aaab"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("abcdd"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaabbcc"));
		Assert.assertEquals('a', leader.goldenLeader("a"));
		Assert.assertEquals('z', leader.goldenLeader("zzasfacasdfadagzzzzzzzzzzzzzzzzzzzzzzzzzz"));
		Assert.assertEquals('a', leader.goldenLeader("aa"));
		Assert.assertEquals('z', leader.goldenLeader("zzzzza"));
		Assert.assertEquals('a', leader.goldenLeader("aaabc"));
		Assert.assertEquals('c', leader.goldenLeader("cbcbcacdcecfcgchcicocpcqcwcdcscdcvcbcmczcacocuchc"));
		Assert.assertEquals('a', leader.goldenLeader("aaaxe"));
		Assert.assertEquals('a', leader.goldenLeader("aaaabbb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("abcc"));
		Assert.assertEquals('a', leader.goldenLeader("aaaabb"));
		Assert.assertEquals('a', leader.goldenLeader("aac"));
		Assert.assertEquals('a', leader.goldenLeader("aaaaabbcc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaabbbbx"));
		Assert.assertEquals('d', leader.goldenLeader("dcdddddjxxd"));
		Assert.assertEquals('d', leader.goldenLeader("abcdddd"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaabbbbccc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaaabbbbb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaabbbc"));
		Assert.assertEquals('a', leader.goldenLeader("aab"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaaaaaabbbbccccdddd"));
		Assert.assertEquals('c', leader.goldenLeader("abccc"));
		Assert.assertEquals('z', leader.goldenLeader("aabzzzzz"));
		Assert.assertEquals('d', leader.goldenLeader("bbccdddddd"));
		Assert.assertEquals('b', leader.goldenLeader("bab"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabbcccc"));
		Assert.assertEquals('a', leader.goldenLeader("aaa"));
		Assert.assertEquals('z', leader.goldenLeader("zzzzz"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("bacc"));
		Assert.assertEquals('b', leader.goldenLeader("bbbbaaa"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("acbb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("fdcbfcdffgcsfdfggngffgfggffgjkjkjbbnmbvdfddfffghg"));
		Assert.assertEquals('b', leader.goldenLeader("abb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabccc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("abcdefghijklmnopqrstuvwxyzxwvutsrqponmlkjihgfedcba"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("babaabababababababababbbabacccccccdddddddcccbababa"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("bbccccdddd"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaaaabbbbbccccc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aaabbbcc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabb"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("abababbbaaaaacccc"));
		Assert.assertEquals(leader.getNoLeader(), leader.goldenLeader("aabbccddeeffgghhiijjkkllmmnnooppqq"));
	}
}
