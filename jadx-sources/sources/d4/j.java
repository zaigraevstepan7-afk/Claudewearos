package d4;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f4889a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4890b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4891c;

    /* renamed from: d, reason: collision with root package name */
    public final k f4892d;

    /* renamed from: e, reason: collision with root package name */
    public final n f4893e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4894f;

    public j() {
        m mVar = new m();
        mVar.f4944a = 0;
        mVar.f4945b = 0;
        mVar.f4946c = 1.0f;
        mVar.f4947d = Float.NaN;
        this.f4890b = mVar;
        l lVar = new l();
        lVar.f4935a = -1;
        lVar.f4936b = 0;
        lVar.f4937c = -1;
        lVar.f4938d = Float.NaN;
        lVar.f4939e = Float.NaN;
        lVar.f4940f = Float.NaN;
        lVar.f4941g = -1;
        lVar.f4942h = null;
        lVar.f4943i = -1;
        this.f4891c = lVar;
        k kVar = new k();
        kVar.f4896a = false;
        kVar.f4902d = -1;
        kVar.f4904e = -1;
        kVar.f4906f = -1.0f;
        kVar.f4908g = -1;
        kVar.f4910h = -1;
        kVar.f4912i = -1;
        kVar.j = -1;
        kVar.f4915k = -1;
        kVar.f4917l = -1;
        kVar.f4919m = -1;
        kVar.f4921n = -1;
        kVar.f4923o = -1;
        kVar.f4924p = -1;
        kVar.f4925q = -1;
        kVar.f4926r = -1;
        kVar.f4927s = -1;
        kVar.f4928t = -1;
        kVar.f4929u = -1;
        kVar.f4930v = 0.5f;
        kVar.f4931w = 0.5f;
        kVar.f4932x = null;
        kVar.f4933y = -1;
        kVar.f4934z = 0;
        kVar.A = 0.0f;
        kVar.B = -1;
        kVar.C = -1;
        kVar.D = -1;
        kVar.E = 0;
        kVar.F = 0;
        kVar.G = 0;
        kVar.H = 0;
        kVar.I = 0;
        kVar.J = 0;
        kVar.K = 0;
        kVar.L = Integer.MIN_VALUE;
        kVar.M = Integer.MIN_VALUE;
        kVar.N = Integer.MIN_VALUE;
        kVar.O = Integer.MIN_VALUE;
        kVar.P = Integer.MIN_VALUE;
        kVar.Q = Integer.MIN_VALUE;
        kVar.R = Integer.MIN_VALUE;
        kVar.S = -1.0f;
        kVar.T = -1.0f;
        kVar.U = 0;
        kVar.V = 0;
        kVar.W = 0;
        kVar.X = 0;
        kVar.Y = -1;
        kVar.Z = -1;
        kVar.f4897a0 = -1;
        kVar.f4899b0 = -1;
        kVar.f4901c0 = 1.0f;
        kVar.f4903d0 = 1.0f;
        kVar.f4905e0 = -1;
        kVar.f4907f0 = 0;
        kVar.f4909g0 = -1;
        kVar.f4916k0 = false;
        kVar.f4918l0 = false;
        kVar.f4920m0 = true;
        kVar.f4922n0 = 0;
        this.f4892d = kVar;
        n nVar = new n();
        nVar.f4949a = 0.0f;
        nVar.f4950b = 0.0f;
        nVar.f4951c = 0.0f;
        nVar.f4952d = 1.0f;
        nVar.f4953e = 1.0f;
        nVar.f4954f = Float.NaN;
        nVar.f4955g = Float.NaN;
        nVar.f4956h = -1;
        nVar.f4957i = 0.0f;
        nVar.j = 0.0f;
        nVar.f4958k = 0.0f;
        nVar.f4959l = false;
        nVar.f4960m = 0.0f;
        this.f4893e = nVar;
        this.f4894f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f4892d;
        eVar.f4828d = kVar.f4908g;
        eVar.f4830e = kVar.f4910h;
        eVar.f4832f = kVar.f4912i;
        eVar.f4834g = kVar.j;
        eVar.f4836h = kVar.f4915k;
        eVar.f4838i = kVar.f4917l;
        eVar.j = kVar.f4919m;
        eVar.f4841k = kVar.f4921n;
        eVar.f4843l = kVar.f4923o;
        eVar.f4845m = kVar.f4924p;
        eVar.f4847n = kVar.f4925q;
        eVar.f4853r = kVar.f4926r;
        eVar.f4854s = kVar.f4927s;
        eVar.f4855t = kVar.f4928t;
        eVar.f4856u = kVar.f4929u;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.E;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.H;
        eVar.f4861z = kVar.Q;
        eVar.A = kVar.P;
        eVar.f4858w = kVar.M;
        eVar.f4860y = kVar.O;
        eVar.D = kVar.f4930v;
        eVar.E = kVar.f4931w;
        eVar.f4849o = kVar.f4933y;
        eVar.f4851p = kVar.f4934z;
        eVar.f4852q = kVar.A;
        eVar.F = kVar.f4932x;
        eVar.S = kVar.B;
        eVar.T = kVar.C;
        eVar.H = kVar.S;
        eVar.G = kVar.T;
        eVar.J = kVar.V;
        eVar.I = kVar.U;
        eVar.V = kVar.f4916k0;
        eVar.W = kVar.f4918l0;
        eVar.K = kVar.W;
        eVar.L = kVar.X;
        eVar.O = kVar.Y;
        eVar.P = kVar.Z;
        eVar.M = kVar.f4897a0;
        eVar.N = kVar.f4899b0;
        eVar.Q = kVar.f4901c0;
        eVar.R = kVar.f4903d0;
        eVar.U = kVar.D;
        eVar.f4826c = kVar.f4906f;
        eVar.f4822a = kVar.f4902d;
        eVar.f4824b = kVar.f4904e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.f4898b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f4900c;
        String str = kVar.f4914j0;
        if (str != null) {
            eVar.X = str;
        }
        eVar.Y = kVar.f4922n0;
        eVar.setMarginStart(kVar.J);
        eVar.setMarginEnd(kVar.I);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f4892d;
        kVar.getClass();
        k kVar2 = this.f4892d;
        kVar.f4896a = kVar2.f4896a;
        kVar.f4898b = kVar2.f4898b;
        kVar.f4900c = kVar2.f4900c;
        kVar.f4902d = kVar2.f4902d;
        kVar.f4904e = kVar2.f4904e;
        kVar.f4906f = kVar2.f4906f;
        kVar.f4908g = kVar2.f4908g;
        kVar.f4910h = kVar2.f4910h;
        kVar.f4912i = kVar2.f4912i;
        kVar.j = kVar2.j;
        kVar.f4915k = kVar2.f4915k;
        kVar.f4917l = kVar2.f4917l;
        kVar.f4919m = kVar2.f4919m;
        kVar.f4921n = kVar2.f4921n;
        kVar.f4923o = kVar2.f4923o;
        kVar.f4924p = kVar2.f4924p;
        kVar.f4925q = kVar2.f4925q;
        kVar.f4926r = kVar2.f4926r;
        kVar.f4927s = kVar2.f4927s;
        kVar.f4928t = kVar2.f4928t;
        kVar.f4929u = kVar2.f4929u;
        kVar.f4930v = kVar2.f4930v;
        kVar.f4931w = kVar2.f4931w;
        kVar.f4932x = kVar2.f4932x;
        kVar.f4933y = kVar2.f4933y;
        kVar.f4934z = kVar2.f4934z;
        kVar.A = kVar2.A;
        kVar.B = kVar2.B;
        kVar.C = kVar2.C;
        kVar.D = kVar2.D;
        kVar.E = kVar2.E;
        kVar.F = kVar2.F;
        kVar.G = kVar2.G;
        kVar.H = kVar2.H;
        kVar.I = kVar2.I;
        kVar.J = kVar2.J;
        kVar.K = kVar2.K;
        kVar.L = kVar2.L;
        kVar.M = kVar2.M;
        kVar.N = kVar2.N;
        kVar.O = kVar2.O;
        kVar.P = kVar2.P;
        kVar.Q = kVar2.Q;
        kVar.R = kVar2.R;
        kVar.S = kVar2.S;
        kVar.T = kVar2.T;
        kVar.U = kVar2.U;
        kVar.V = kVar2.V;
        kVar.W = kVar2.W;
        kVar.X = kVar2.X;
        kVar.Y = kVar2.Y;
        kVar.Z = kVar2.Z;
        kVar.f4897a0 = kVar2.f4897a0;
        kVar.f4899b0 = kVar2.f4899b0;
        kVar.f4901c0 = kVar2.f4901c0;
        kVar.f4903d0 = kVar2.f4903d0;
        kVar.f4905e0 = kVar2.f4905e0;
        kVar.f4907f0 = kVar2.f4907f0;
        kVar.f4909g0 = kVar2.f4909g0;
        kVar.f4914j0 = kVar2.f4914j0;
        int[] iArr = kVar2.f4911h0;
        if (iArr != null) {
            kVar.f4911h0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            kVar.f4911h0 = null;
        }
        kVar.f4913i0 = kVar2.f4913i0;
        kVar.f4916k0 = kVar2.f4916k0;
        kVar.f4918l0 = kVar2.f4918l0;
        kVar.f4920m0 = kVar2.f4920m0;
        kVar.f4922n0 = kVar2.f4922n0;
        l lVar = jVar.f4891c;
        lVar.getClass();
        l lVar2 = this.f4891c;
        lVar2.getClass();
        lVar.f4935a = lVar2.f4935a;
        lVar.f4937c = lVar2.f4937c;
        lVar.f4939e = lVar2.f4939e;
        lVar.f4938d = lVar2.f4938d;
        m mVar = this.f4890b;
        int i10 = mVar.f4944a;
        m mVar2 = jVar.f4890b;
        mVar2.f4944a = i10;
        mVar2.f4946c = mVar.f4946c;
        mVar2.f4947d = mVar.f4947d;
        mVar2.f4945b = mVar.f4945b;
        n nVar = jVar.f4893e;
        nVar.getClass();
        n nVar2 = this.f4893e;
        nVar2.getClass();
        nVar.f4949a = nVar2.f4949a;
        nVar.f4950b = nVar2.f4950b;
        nVar.f4951c = nVar2.f4951c;
        nVar.f4952d = nVar2.f4952d;
        nVar.f4953e = nVar2.f4953e;
        nVar.f4954f = nVar2.f4954f;
        nVar.f4955g = nVar2.f4955g;
        nVar.f4956h = nVar2.f4956h;
        nVar.f4957i = nVar2.f4957i;
        nVar.j = nVar2.j;
        nVar.f4958k = nVar2.f4958k;
        nVar.f4959l = nVar2.f4959l;
        nVar.f4960m = nVar2.f4960m;
        jVar.f4889a = this.f4889a;
        return jVar;
    }
}
