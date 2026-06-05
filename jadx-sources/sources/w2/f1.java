package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.r2 f18255a = new f1.r2(g0.A);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.r2 f18256b = new f1.r2(g0.B);

    /* renamed from: c, reason: collision with root package name */
    public static final f1.r2 f18257c = new f1.r2(g0.D);

    /* renamed from: d, reason: collision with root package name */
    public static final f1.r2 f18258d = new f1.r2(g0.C);

    /* renamed from: e, reason: collision with root package name */
    public static final f1.r2 f18259e = new f1.r2(g0.F);

    /* renamed from: f, reason: collision with root package name */
    public static final f1.r2 f18260f = new f1.r2(g0.E);

    /* renamed from: g, reason: collision with root package name */
    public static final f1.r2 f18261g = new f1.r2(g0.L);

    /* renamed from: h, reason: collision with root package name */
    public static final f1.r2 f18262h = new f1.r2(g0.H);

    /* renamed from: i, reason: collision with root package name */
    public static final f1.r2 f18263i = new f1.r2(g0.I);
    public static final f1.r2 j = new f1.r2(g0.K);

    /* renamed from: k, reason: collision with root package name */
    public static final f1.r2 f18264k = new f1.r2(g0.J);

    /* renamed from: l, reason: collision with root package name */
    public static final f1.r2 f18265l = new f1.r2(g0.M);

    /* renamed from: m, reason: collision with root package name */
    public static final f1.r2 f18266m = new f1.r2(g0.N);

    /* renamed from: n, reason: collision with root package name */
    public static final f1.r2 f18267n = new f1.r2(g0.O);

    /* renamed from: o, reason: collision with root package name */
    public static final f1.r2 f18268o = new f1.r2(g0.Q);

    /* renamed from: p, reason: collision with root package name */
    public static final f1.r2 f18269p;

    /* renamed from: q, reason: collision with root package name */
    public static final f1.r2 f18270q;

    /* renamed from: r, reason: collision with root package name */
    public static final f1.r2 f18271r;

    /* renamed from: s, reason: collision with root package name */
    public static final f1.r2 f18272s;

    /* renamed from: t, reason: collision with root package name */
    public static final f1.r2 f18273t;

    /* renamed from: u, reason: collision with root package name */
    public static final f1.r2 f18274u;

    /* renamed from: v, reason: collision with root package name */
    public static final f1.r2 f18275v;

    /* renamed from: w, reason: collision with root package name */
    public static final f1.v f18276w;

    /* renamed from: x, reason: collision with root package name */
    public static final f1.r2 f18277x;

    static {
        u6.v.Q(new b6.j(28));
        f18269p = new f1.r2(g0.T);
        f18270q = new f1.r2(g0.S);
        f18271r = new f1.r2(g0.U);
        f18272s = new f1.r2(g0.V);
        f18273t = new f1.r2(g0.W);
        f18274u = new f1.r2(g0.X);
        f18275v = new f1.r2(g0.P);
        f18276w = new f1.v(g0.R);
        f18277x = new f1.r2(g0.G);
    }

    public static final void a(v2.r1 r1Var, n0 n0Var, ej.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(1925803616);
        int i11 = (i0Var.f(r1Var) ? 4 : 2) | i10 | (i0Var.f(n0Var) ? 32 : 16) | (i0Var.h(eVar) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            t tVar = (t) r1Var;
            f1.r1 r1VarA = f18255a.a(tVar.getAccessibilityManager());
            f1.r1 r1VarA2 = f18256b.a(tVar.getAutofill());
            f1.r1 r1VarA3 = f18258d.a(tVar.getAutofillManager());
            f1.r1 r1VarA4 = f18257c.a(tVar.getAutofillTree());
            f1.r1 r1VarA5 = f18259e.a(tVar.m14getClipboardManager());
            f1.r1 r1VarA6 = f18260f.a(tVar.m13getClipboard());
            f1.r1 r1VarA7 = f18262h.a(tVar.getDensity());
            f1.r1 r1VarA8 = f18263i.a(tVar.getFocusOwner());
            f1.r1 r1VarA9 = j.a(tVar.getFontLoader());
            r1VarA9.f6436c = false;
            f1.r1 r1VarA10 = f18264k.a(tVar.getFontFamilyResolver());
            r1VarA10.f6436c = false;
            f1.s.b(new f1.r1[]{r1VarA, r1VarA2, r1VarA3, r1VarA4, r1VarA5, r1VarA6, r1VarA7, r1VarA8, r1VarA9, r1VarA10, f18265l.a(tVar.getHapticFeedBack()), f18266m.a(tVar.getInputModeManager()), f18267n.a(tVar.getLayoutDirection()), f18269p.a(tVar.getTextInputService()), f18270q.a(tVar.getSoftwareKeyboardController()), f18271r.a(tVar.getTextToolbar()), f18272s.a(n0Var), f18273t.a(tVar.getViewConfiguration()), f18274u.a(tVar.getWindowInfo()), f18275v.a(tVar.getPointerIconService()), f18261g.a(tVar.getGraphicsContext()), q1.b.f13175a.a(tVar.getRetainedValuesStore()), f18268o.a(tVar.getLocaleList())}, eVar, i0Var, ((i11 >> 3) & 112) | 8);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e1(r1Var, n0Var, eVar, i10);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final f1.r2 c() {
        return f18263i;
    }
}
