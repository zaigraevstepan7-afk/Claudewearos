package b6;

import c1.a4;
import c1.g2;
import c1.h1;
import c1.l1;
import c1.m1;
import c1.o5;
import c1.o8;
import c1.p;
import c1.u2;
import c1.w0;
import c1.x0;
import c1.y4;
import com.google.android.gms.internal.ads.zzbch;
import d0.u;
import e1.n0;
import f1.n;
import f1.r2;
import f1.v;
import java.util.UUID;
import pi.o;
import t2.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1608a;

    public /* synthetic */ j(int i10) {
        this.f1608a = i10;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f1608a) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                float f10 = c1.j.f2253a;
                return h1.f2177a;
            case 3:
                v vVar = p.f2567a;
                return l1.f2364a;
            case 4:
                v vVar2 = p.f2567a;
                return m1.f2413a;
            case 5:
                long j = e1.k.f5540z;
                return new w0(j, e1.k.j, e1.k.A, e1.k.f5525k, e1.k.f5520e, e1.k.E, e1.k.f5528n, e1.k.F, e1.k.f5529o, e1.k.R, e1.k.f5534t, e1.k.S, e1.k.f5535u, e1.k.f5516a, e1.k.f5522g, e1.k.I, e1.k.f5532r, e1.k.Q, e1.k.f5533s, j, e1.k.f5521f, e1.k.f5519d, e1.k.f5517b, e1.k.f5523h, e1.k.f5518c, e1.k.f5524i, e1.k.f5538x, e1.k.f5539y, e1.k.D, e1.k.J, e1.k.P, e1.k.K, e1.k.L, e1.k.M, e1.k.N, e1.k.O, e1.k.B, e1.k.C, e1.k.f5526l, e1.k.f5527m, e1.k.G, e1.k.H, e1.k.f5530p, e1.k.f5531q, e1.k.T, e1.k.U, e1.k.f5536v, e1.k.f5537w);
            case 6:
                r2 r2Var = x0.f2845a;
                return Boolean.TRUE;
            case 7:
                return Float.valueOf(1.0f);
            case 8:
                m mVar = g2.f2117a;
                return Boolean.TRUE;
            case 9:
                return new s3.f(48);
            case 10:
                r2 r2Var2 = u2.f2738a;
                return Boolean.FALSE;
            case 11:
                return a4.f1881a;
            case 12:
                return UUID.randomUUID();
            case 13:
                return new y4();
            case 14:
                return new o5();
            case 15:
                return new s3.f(0);
            case 16:
                return n0.f5583a;
            case 17:
                return new o8();
            case 18:
                return UUID.randomUUID().toString();
            case 19:
                return o.f13011a;
            case 20:
                v vVar3 = d.i.f4334a;
                return null;
            case zzbch.zzt.zzm /* 21 */:
                v vVar4 = d.j.f4335a;
                return null;
            case 22:
                return new u(0, 0);
            case 23:
                return new e0.v(0, 0);
            case 24:
                v vVar5 = e6.a.f5801a;
                return null;
            case 25:
                return new f9.b();
            case 26:
                return new f9.c();
            case 27:
                return new f9.d();
            case 28:
                n.b("Unexpected call to default provider");
                throw new b3.e();
            default:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
        }
    }
}
