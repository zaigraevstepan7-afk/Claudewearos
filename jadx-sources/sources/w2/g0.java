package w2;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends fj.m implements ej.a {
    public static final g0 A;
    public static final g0 B;
    public static final g0 C;
    public static final g0 D;
    public static final g0 E;
    public static final g0 F;
    public static final g0 G;
    public static final g0 H;
    public static final g0 I;
    public static final g0 J;
    public static final g0 K;
    public static final g0 L;
    public static final g0 M;
    public static final g0 N;
    public static final g0 O;
    public static final g0 P;
    public static final g0 Q;
    public static final g0 R;
    public static final g0 S;
    public static final g0 T;
    public static final g0 U;
    public static final g0 V;
    public static final g0 W;
    public static final g0 X;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f18279b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f18280c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f18281d;

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f18282e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f18283f;

    /* renamed from: z, reason: collision with root package name */
    public static final g0 f18284z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18285a;

    static {
        int i10 = 0;
        f18279b = new g0(i10, 0);
        f18280c = new g0(i10, 1);
        f18281d = new g0(i10, 2);
        f18282e = new g0(i10, 3);
        f18283f = new g0(i10, 4);
        f18284z = new g0(i10, 5);
        A = new g0(i10, 6);
        B = new g0(i10, 7);
        C = new g0(i10, 8);
        D = new g0(i10, 9);
        E = new g0(i10, 10);
        F = new g0(i10, 11);
        G = new g0(i10, 12);
        H = new g0(i10, 13);
        I = new g0(i10, 14);
        J = new g0(i10, 15);
        K = new g0(i10, 16);
        L = new g0(i10, 17);
        M = new g0(i10, 18);
        N = new g0(i10, 19);
        O = new g0(i10, 20);
        P = new g0(i10, 21);
        Q = new g0(i10, 22);
        R = new g0(i10, 23);
        S = new g0(i10, 24);
        T = new g0(i10, 25);
        U = new g0(i10, 26);
        V = new g0(i10, 27);
        W = new g0(i10, 28);
        X = new g0(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10, int i11) {
        super(i10);
        this.f18285a = i11;
    }

    @Override // ej.a
    public final Object a() {
        Choreographer choreographer;
        ti.c cVar = null;
        switch (this.f18285a) {
            case 0:
                AndroidCompositionLocals_androidKt.a("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.a("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.a("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    xj.e eVar = qj.m0.f13601a;
                    int i10 = 2;
                    choreographer = (Choreographer) qj.b0.A(vj.n.f18117a, new lb.k0(i10, cVar, i10));
                }
                l0 l0Var = new l0(choreographer, wd.a.u(Looper.getMainLooper()));
                return yd.f.W(l0Var, l0Var.E);
            case 6:
            case 7:
                return null;
            case 8:
                f1.b("LocalAutofillManager");
                throw null;
            case 9:
                f1.b("LocalAutofillTree");
                throw null;
            case 10:
                f1.b("LocalClipboard");
                throw null;
            case 11:
                f1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                f1.b("LocalDensity");
                throw null;
            case 14:
                f1.b("LocalFocusManager");
                throw null;
            case 15:
                f1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                f1.b("LocalFontLoader");
                throw null;
            case 17:
                f1.b("LocalGraphicsContext");
                throw null;
            case 18:
                f1.b("LocalHapticFeedback");
                throw null;
            case 19:
                f1.b("LocalInputManager");
                throw null;
            case 20:
                f1.b("LocalLayoutDirection");
                throw null;
            case zzbch.zzt.zzm /* 21 */:
                return null;
            case 22:
                f1.b("LocalProvidableLocaleList");
                throw null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case 26:
                f1.b("LocalTextToolbar");
                throw null;
            case 27:
                f1.b("LocalUriHandler");
                throw null;
            case 28:
                f1.b("LocalViewConfiguration");
                throw null;
            default:
                f1.b("LocalWindowInfo");
                throw null;
        }
    }
}
