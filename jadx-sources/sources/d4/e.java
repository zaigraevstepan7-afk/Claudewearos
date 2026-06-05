package d4;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4822a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4823a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4824b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4825b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4826c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4827c0;

    /* renamed from: d, reason: collision with root package name */
    public int f4828d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4829d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4830e;

    /* renamed from: e0, reason: collision with root package name */
    public int f4831e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4832f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4833f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4834g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4835g0;

    /* renamed from: h, reason: collision with root package name */
    public int f4836h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4837h0;

    /* renamed from: i, reason: collision with root package name */
    public int f4838i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4839i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4840j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4841k;

    /* renamed from: k0, reason: collision with root package name */
    public float f4842k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4843l;

    /* renamed from: l0, reason: collision with root package name */
    public int f4844l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4845m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4846m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4847n;

    /* renamed from: n0, reason: collision with root package name */
    public float f4848n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4849o;

    /* renamed from: o0, reason: collision with root package name */
    public a4.d f4850o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4851p;

    /* renamed from: q, reason: collision with root package name */
    public float f4852q;

    /* renamed from: r, reason: collision with root package name */
    public int f4853r;

    /* renamed from: s, reason: collision with root package name */
    public int f4854s;

    /* renamed from: t, reason: collision with root package name */
    public int f4855t;

    /* renamed from: u, reason: collision with root package name */
    public int f4856u;

    /* renamed from: v, reason: collision with root package name */
    public int f4857v;

    /* renamed from: w, reason: collision with root package name */
    public int f4858w;

    /* renamed from: x, reason: collision with root package name */
    public int f4859x;

    /* renamed from: y, reason: collision with root package name */
    public int f4860y;

    /* renamed from: z, reason: collision with root package name */
    public int f4861z;

    public final void a() {
        this.f4827c0 = false;
        this.Z = true;
        this.f4823a0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.W) {
            this.f4823a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.Z = false;
            if (i10 == 0 && this.K == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.V = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f4823a0 = false;
            if (i11 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.W = true;
            }
        }
        if (this.f4826c == -1.0f && this.f4822a == -1 && this.f4824b == -1) {
            return;
        }
        this.f4827c0 = true;
        this.Z = true;
        this.f4823a0 = true;
        if (!(this.f4850o0 instanceof a4.h)) {
            this.f4850o0 = new a4.h();
        }
        ((a4.h) this.f4850o0).N(this.U);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.resolveLayoutDirection(int):void");
    }
}
