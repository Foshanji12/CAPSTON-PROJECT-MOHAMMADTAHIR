package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private SignInPage signinpage;
	private Accountpage accountpage;
	private OrderPage orderpage;
	private Homepagesteps homepage;

	public POMFactory() {
		this.signinpage = new SignInPage();
		this.accountpage = new Accountpage();
		this.orderpage = new OrderPage();
		this.homepage = new Homepagesteps();

	}

	public SignInPage signinpage() {
		return this.signinpage;
	}

	public Accountpage accountpage() {
		return this.accountpage;
	}

	public OrderPage orderpage() {
		return this.orderpage;
	}

	public Homepagesteps homepage() {
		return this.homepage;

	}
}
