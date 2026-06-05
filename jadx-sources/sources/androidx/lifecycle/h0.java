package androidx.lifecycle;

import android.content.SharedPreferences;
import android.net.Uri;
import c1.j8;
import c1.r3;
import c1.x6;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import com.google.android.gms.internal.ads.zzbch;
import f1.g1;
import f1.h1;
import java.util.List;
import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1090a;

    /* renamed from: b, reason: collision with root package name */
    public int f1091b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(x6 x6Var, w6.z zVar, ti.c cVar) {
        super(2, cVar);
        this.f1090a = 4;
        f1 f1Var = f1.f17189a;
        this.f1092c = x6Var;
        this.f1093d = zVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        int i10 = this.f1090a;
        Object obj2 = this.f1093d;
        switch (i10) {
            case 0:
                h0 h0Var = new h0((ej.e) obj2, cVar, 0);
                h0Var.f1092c = obj;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0((b1.a) obj2, cVar, 1);
                h0Var2.f1092c = obj;
                return h0Var2;
            case 2:
                return new h0((b1.i) this.f1092c, (t.j) obj2, cVar, 2);
            case 3:
                return new h0((ra.r0) this.f1092c, (ib.j) obj2, cVar, 3);
            case 4:
                x6 x6Var = (x6) this.f1092c;
                f1 f1Var = f1.f17189a;
                return new h0(x6Var, (w6.z) obj2, cVar);
            case 5:
                return new h0((c3.c) this.f1092c, (Runnable) obj2, cVar, 5);
            case 6:
                return new h0((a2.a0) this.f1092c, (j8) obj2, cVar, 6);
            case 7:
                return new h0((p2.a0) this.f1092c, (g0.h0) obj2, cVar, 7);
            case 8:
                return new h0((ej.a) this.f1092c, (g1) obj2, cVar, 8);
            case 9:
                h0 h0Var3 = new h0((hb.h) this.f1092c, (ej.c) obj2, cVar, 9);
                h0Var3.f1091b = ((Number) obj).intValue();
                return h0Var3;
            case 10:
                return new h0((t.c) this.f1092c, (b2.b) obj2, cVar, 10);
            case 11:
                return new h0((h0.h) this.f1092c, (r3) obj2, cVar, 11);
            case 12:
                return new h0((h8.r) this.f1092c, (r8.g) obj2, cVar, 12);
            case 13:
                h0 h0Var4 = new h0((hb.h) obj2, cVar, 13);
                h0Var4.f1092c = obj;
                return h0Var4;
            case 14:
                return new h0((hb.n) this.f1092c, (p2.w) obj2, cVar, 14);
            case 15:
                return new h0((f1.a1) this.f1092c, (f1.a1) obj2, cVar, 15);
            case 16:
                return new h0((p2.a0) this.f1092c, (v0.u0) obj2, cVar, 16);
            case 17:
                h0 h0Var5 = new h0((List) obj2, cVar, 17);
                h0Var5.f1092c = obj;
                return h0Var5;
            case 18:
                h0 h0Var6 = new h0((m5.z) obj2, cVar, 18);
                h0Var6.f1092c = obj;
                return h0Var6;
            case 19:
                h0 h0Var7 = new h0((m9.a) obj2, cVar, 19);
                h0Var7.f1092c = obj;
                return h0Var7;
            case 20:
                return new h0((ma.a) this.f1092c, (List) obj2, cVar, 20);
            case zzbch.zzt.zzm /* 21 */:
                return new h0((g0.h0) this.f1092c, (List) obj2, cVar, 21);
            case 22:
                return new h0((c.m) this.f1092c, (mi.o) obj2, cVar, 22);
            case 23:
                return new h0((n6.a) this.f1092c, (Uri) obj2, cVar, 23);
            case 24:
                return new h0((h1) obj2, cVar, 24);
            case 25:
                return new h0((o6.a) this.f1092c, (q6.a) obj2, cVar, 25);
            case 26:
                return new h0((SharedPreferences) this.f1092c, (HomeActivity) obj2, cVar, 26);
            case 27:
                return new h0((t.c) this.f1092c, (t.c) obj2, cVar, 27);
            case 28:
                h0 h0Var8 = new h0((sj.r) obj2, cVar, 28);
                h0Var8.f1092c = obj;
                return h0Var8;
            default:
                return new h0((t0.a) this.f1092c, (t0.j) obj2, cVar, 29);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1090a) {
            case 0:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 3:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 4:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 5:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 6:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 7:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 8:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 9:
                h0 h0Var = (h0) create(Integer.valueOf(((Number) obj).intValue()), (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                h0Var.invokeSuspend(oVar);
                return oVar;
            case 10:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 11:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 12:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 13:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 14:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 15:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 16:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 17:
                return ((h0) create((m5.i) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 18:
                if (obj != null) {
                    throw new ClassCastException();
                }
                h0 h0Var2 = (h0) create(null, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                h0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 19:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 20:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case zzbch.zzt.zzm /* 21 */:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 22:
                ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                return ui.a.f17085a;
            case 23:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 24:
                ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                return ui.a.f17085a;
            case 25:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 26:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 27:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 28:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((h0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01b3 -> B:92:0x01b6). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1090a = i10;
        this.f1092c = obj;
        this.f1093d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1090a = i10;
        this.f1093d = obj;
    }
}
