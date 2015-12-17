public class YahtzeeSortDice
{
	int first;
	int second;
	int third;
	int fourth;
	int fifth;

	public YahtzeeSortDice(int a, int b, int c, int d, int e){
		{
			if (a < b && a < c && a < d && a < e) {
				first = a;
			} else if (b < a && b < c && b < d && b < e) {
				first = b;
			} else if (c < a && c < b && c < d && c < e) {
				first = c;
			} else if (d < a && d < c && d < b && b < e) {
				first = d;
			} else if (e < a && e < b && e < c && e < d) {
				first = e;
			}

			if (a == first) {
				if (b > first  && b < c && b < d && b < e) {
					second = b;
				} else if (c > first && c < b && c < d && c < e) {
					second = c;
				} else if (d > first  && d < c && d < b && d < e) {
					second = d;
				} else if (e > first && e < b && e < c && e < d) {
					second = e;
				}
				if (b == second) {
					if (c > second && c < d && c < e) {
						third = c;
					} else if (d > second && d < c && d < e) {
						third = d;
					} else if (e > second && e < c && e < d) {
						third = e;
					}
					if (c == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < d){
							fourth = e;
							fifth = d;
						}
					}
					if (d == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}

				}

				if (c == second) {
					if (b > second && b < d && b < e) {
						third = b;
					} else if (d > second && d < b && d < e) {
						third = d;
					} else if (e > second && e < b && e < d) {
						third = e;
					}
					if (d == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (e == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
				}
				if (d == second) {
					if (b > second && b < c && b < e) {
						third = b;
					} else if (c > second && c < b && c < e) {
						third = c;
					} else if (e > second && e < b && e < c) {
						third = e;
					}
					if (c == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

				if (e == second) {
					if (b > second && b < c && b < d) {
						third = b;
					} else if (c > second && c < b && c < d) {
						third = c;
					} else if (d > second && d < b && d < c) {
						third = d;
					}
					if (c == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}
					if (d == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

			}




			if (b == first) {
				if (a > first  && a < c && a < d && a < e) {
					second = a;
				} else if (c > first && c < a && c < d && c < e) {
					second = c;
				} else if (d > first  && d < c && d < a && d < e) {
					second = d;
				} else if (e > first && e < a && e < c && e < d) {
					second = e;
				}
				if (a == second) {
					if (c > second && c < d && c < e) {
						third = c;
					} else if (d > second && d < c && d < e) {
						third = d;
					} else if (e > second && e < c && e < d) {
						third = e;
					}
					if (c == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < d){
							fourth = e;
							fifth = d;
						}
					}
					if (d == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}

				}

				if (c == second) {
					if (a > second && a < d && a < e) {
						third = a;
					} else if (d > second && d < a && d < e) {
						third = d;
					} else if (e > second && e < a && e < d) {
						third = e;
					}
					if (d == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (a == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (e == third){
						if (a > third && a < d){
							fourth = a;
							fifth = d;
						}
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
					}
				}
				if (d == second) {
					if (a > second && a < c && a < e) {
						third = a;
					} else if (c > second && c < a && c < e) {
						third = c;
					} else if (e > second && e < a && e < c) {
						third = e;
					}
					if (c == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (a == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
					}
				}

				if (e == second) {
					if (a > second && a < c && a < d) {
						third = a;
					} else if (c > second && c < a && c < d) {
						third = c;
					} else if (d > second && d < a && d < c) {
						third = d;
					}
					if (c == third){
						if (a > third && a < d){
							fourth = a;
							fifth = d;
						}
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
					}
					if (a == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}
					if (d == third){
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
					}
				}

			}








			if (c == first) {
				if (b > first  && b < a && b < d && b < e) {
					second = b;
				} else if (a > first && a < b && a < d && a < e) {
					second = a;
				} else if (d > first  && d < a && d < b && d < e) {
					second = d;
				} else if (e > first && e < b && e < a && e < d) {
					second = e;
				}
				if (b == second) {
					if (a > second && a < d && a < e) {
						third = a;
					} else if (d > second && d < a && d < e) {
						third = d;
					} else if (e > second && e < a && e < d) {
						third = e;
					}
					if (a == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < d){
							fourth = e;
							fifth = d;
						}
					}
					if (d == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (e == third){
						if (a > third && a < d){
							fourth = a;
							fifth = d;
						}
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
					}

				}

				if (a == second) {
					if (b > second && b < d && b < e) {
						third = b;
					} else if (d > second && d < b && d < e) {
						third = d;
					} else if (e > second && e < b && e < d) {
						third = e;
					}
					if (d == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (d > third && d < e){
							fourth = d;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (e == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
				}
				if (d == second) {
					if (b > second && b < a && b < e) {
						third = b;
					} else if (a > second && a < b && a < e) {
						third = a;
					} else if (e > second && e < b && e < a) {
						third = e;
					}
					if (a == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (e == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
				}

				if (e == second) {
					if (b > second && b < a && b < d) {
						third = b;
					} else if (a > second && a < b && a < d) {
						third = a;
					} else if (d > second && d < b && d < a) {
						third = d;
					}
					if (a == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
					if (b == third){
						if (a > third && a < d){
							fourth = a;
							fifth = d;
						}
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
					}
					if (d == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
				}

			}








			if (d == first) {
				if (b > first  && b < c && b < a && b < e) {
					second = b;
				} else if (c > first && c < b && c < a && c < e) {
					second = c;
				} else if (a > first  && a < c && a < b && a < e) {
					second = a;
				} else if (e > first && e < b && e < c && e < a) {
					second = e;
				}
				if (b == second) {
					if (c > second && c < a && c < e) {
						third = c;
					} else if (a > second && a < c && a < e) {
						third = a;
					} else if (e > second && e < c && e < a) {
						third = e;
					}
					if (c == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (a == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
					}

				}

				if (c == second) {
					if (b > second && b < a && b < e) {
						third = b;
					} else if (a > second && a < b && a < e) {
						third = a;
					} else if (e > second && e < b && e < a) {
						third = e;
					}
					if (a == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (a > third && a < e){
							fourth = a;
							fifth = e;
						}
						if (e > third && e < a){
							fourth = e;
							fifth = a;
						}
					}
					if (e == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
				}
				if (a == second) {
					if (b > second && b < c && b < e) {
						third = b;
					} else if (c > second && c < b && c < e) {
						third = c;
					} else if (e > second && e < b && e < c) {
						third = e;
					}
					if (c == third){
						if (b > third && b < e){
							fourth = b;
							fifth = e;
						}
						if (e > third && e < b){
							fourth = e;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < e){
							fourth = c;
							fifth = e;
						}
						if (e > third && e < c){
							fourth = e;
							fifth = c;
						}
					}
					if (e == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

				if (e == second) {
					if (b > second && b < c && b < a) {
						third = b;
					} else if (c > second && c < b && c < a) {
						third = c;
					} else if (a > second && a < b && a < c) {
						third = a;
					}
					if (c == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
					}
					if (a == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

			}






			if (e == first) {
				if (b > first  && b < c && b < d && b < a) {
					second = b;
				} else if (c > first && c < b && c < d && c < a) {
					second = c;
				} else if (d > first  && d < c && d < b && d < a) {
					second = d;
				} else if (a > first && a < b && a < c && a < d) {
					second = a;
				}
				if (b == second) {
					if (c > second && c < d && c < a) {
						third = c;
					} else if (d > second && d < c && d < a) {
						third = d;
					} else if (a > second && a < c && a < d) {
						third = a;
					}
					if (c == third){
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
						if (a > third && a < d){
							fourth = a;
							fifth = d;
						}
					}
					if (d == third){
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
					}
					if (a == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}

				}

				if (c == second) {
					if (b > second && b < d && b < a) {
						third = b;
					} else if (d > second && d < b && d < a) {
						third = d;
					} else if (a > second && a < b && a < d) {
						third = a;
					}
					if (d == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
					if (b == third){
						if (d > third && d < a){
							fourth = d;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
					if (a == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
				}
				if (d == second) {
					if (b > second && b < c && b < a) {
						third = b;
					} else if (c > second && c < b && c < a) {
						third = c;
					} else if (a > second && a < b && a < c) {
						third = a;
					}
					if (c == third){
						if (b > third && b < a){
							fourth = b;
							fifth = a;
						}
						if (a > third && a < b){
							fourth = a;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < a){
							fourth = c;
							fifth = a;
						}
						if (a > third && a < c){
							fourth = a;
							fifth = c;
						}
					}
					if (a == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

				if (a == second) {
					if (b > second && b < c && b < d) {
						third = b;
					} else if (c > second && c < b && c < d) {
						third = c;
					} else if (d > second && d < b && d < c) {
						third = d;
					}
					if (c == third){
						if (b > third && b < d){
							fourth = b;
							fifth = d;
						}
						if (d > third && d < b){
							fourth = d;
							fifth = b;
						}
					}
					if (b == third){
						if (c > third && c < d){
							fourth = c;
							fifth = d;
						}
						if (d > third && d < c){
							fourth = d;
							fifth = c;
						}
					}
					if (d == third){
						if (b > third && b < c){
							fourth = b;
							fifth = c;
						}
						if (c > third && c < b){
							fourth = c;
							fifth = b;
						}
					}
				}

			}

		}
	}



	/* returns the minimum of the five numbers */
	public int getFirst()
	{
		return first;
	}

	/* returns the second smallest of the five number */
	public int getSecond()
	{
		//your code here
		return second;
	}

	/* returns the middle of the five numbers */
	public int getThird()
	{
		//your code here
		return third;
	}

	/* returns the second largest of the five numbers */
	public int getFourth()
	{
		//your code here
		return fourth;
	}

	/* returns the biggest of the five numbers */
	public int getFifth()
	{
		//your code here
		return fifth;
	}
}