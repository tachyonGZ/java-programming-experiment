public class exp4_12{
	public static void main(String[] args) {
		String source = "我牵着你的手经过，种麦芽糖的山坡，香浓的诱惑，你脸颊微热，吐气在我的耳朵\n" +
                        "摘下麦芽糖熟透，我醒来还笑着，开心的被黏手，我满嘴都是糖果\n" +
                        "牵着你的手经过，种麦芽糖的山坡，甜蜜的四周，我低头害羞，我们愉快的梦游\n" +
                        "我在草地上喝着，麦芽糖酿的酒，鲜嫩的小时候，我好想再咬一口\n";
        String target = "麦芽糖";

		int cnt = 0;
		for (
			int index = 0;
			(index = source.indexOf(target, index)) != -1;
			index += target.length()
		){
			cnt += 1;
		}

		System.out.println(cnt);
	}
}