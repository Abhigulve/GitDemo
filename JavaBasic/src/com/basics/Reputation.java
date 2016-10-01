package com.basics;

public class Reputation {

	public static void main(String[] args) {

		// Test case1
		int b[] = { -1, 2 };
		int g[] = { 0, 2 };
		int m = 2;

		/*
		 * Test case2 int b[] = { 1, 1 }; int g[] = { -1, -1 }; int m = 2;
		 * answer = 0
		 */

		/*
		 * int b[] = { -702, 523, 562, 199, -574, 995, -377, 283, 128, 73, 977,
		 * 771, 315, 886, -42, 208, 752, 635, 295, 961, 792, 603, 447, 603, 113,
		 * 211, 527, 813, 773, 515, 394, -976, 672, 18, 245, 313, 784, 401, 25,
		 * 168, 630, 58, -378, 836, 833, 934, 40, 920, -233, 323, -809, -486,
		 * 296, 563, 490, 34, 306, 411, 501, -243, 253, -328, 920, -556, 625,
		 * 129, 510, -348, 10, -660, 101, 303, 620, 440 };
		 * 
		 * int g[] = { 696, 658, 510, 535, 568, 174, -853, 116, -294, -49, -981,
		 * -453, 466, -207, 325, 491, -147, -174, -756, 820, -470, 342, 559,
		 * 182, 648, 717, 318, -802, 210, -775, 358, -655, 446, 402, 154, 649,
		 * 585, 16, -566, 536, 187, 567, 351, -698, 194, 173, -619, 295, 383,
		 * 205, -889, 804, -238, 8, -323, 683, 436, 347, 129, -176, 805, 630,
		 * 676, -615, 991, 632, -80, 182, 81, 518, 556, -90, 28, -567 };
		 * 
		 * int m = 7790;
		 */
		/*
		 * int b[] = { -1, 2, 0, -4 }; int g[] = { 2, 3, -1, -1 }; int m = 2;
		 */
		System.out.println("Test Case3");
		System.out.println("b length = " + b.length);
		System.out.println("g length = " + g.length);
		System.out.println("Maximum Reputation of an array = "
				+ calculateReputation(b, g, m));
		System.out.println("---------------------------------------------");

	}

	private static int calculateReputation(int[] b, int[] g, int m) {
		int maxReputation = 0, tempReputation = 0;
		for (int k = 1; k <= m; k++) {
			for (int i = 0; i < b.length; i++) {
				if (b[i] >= g[i]) {
					tempReputation = getMaxReputation(b, g, k);
				} else {
					tempReputation = getMaxReputation(b, g, k);
				}
				if (tempReputation >= maxReputation) {
					maxReputation = tempReputation;
				}
			}
		}
		return maxReputation;
	}

	private static int getMaxReputation(int bArr[], int gArr[],
			int mAddToBorGArray) {
		int maxReputation = 0, tempReputation = 0;
		for (int i = 0; i < bArr.length; i++) {
			tempReputation = bArr[i] * gArr[i] + mAddToBorGArray;
			if (tempReputation >= maxReputation) {
				maxReputation = tempReputation;
			}
		}
		return maxReputation;
	}
}
