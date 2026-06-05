package ra;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f1.q2;
import java.time.LocalDateTime;
import lb.k2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14087a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f14088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tj.e0 f14089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f14090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q2 f14092f;

    public /* synthetic */ n(f1.a1 a1Var, r0 r0Var, tj.e0 e0Var, ej.c cVar, q2 q2Var) {
        this.f14091e = a1Var;
        this.f14088b = r0Var;
        this.f14089c = e0Var;
        this.f14090d = cVar;
        this.f14092f = q2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14087a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f1.v vVar = xa.c.f19854a;
                    f1.a1 a1Var = this.f14091e;
                    f1.s.a(vVar.a((xa.b) a1Var.getValue()), p1.j.d(-1460494175, new n(this.f14088b, this.f14089c, this.f14090d, a1Var, this.f14092f), i0Var), i0Var, 56);
                } else {
                    i0Var.W();
                }
                break;
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r0 r0Var = this.f14088b;
                    f1.a1 a1VarH = a.a.h(r0Var.f14162t, i0Var2);
                    Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
                    ib.g gVar = (ib.g) this.f14092f.getValue();
                    LocalDateTime localDateTime = (LocalDateTime) a1VarH.getValue();
                    boolean zH = i0Var2.h(r0Var);
                    Object objQ = i0Var2.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (zH || objQ == fVar) {
                        k0.h1 h1Var = new k0.h1(1, r0Var, r0.class, "setVisibleGridApps", "setVisibleGridApps(Ljava/util/Set;)V", 0, 0, 4);
                        i0Var2.l0(h1Var);
                        objQ = h1Var;
                    }
                    ej.c cVar = (ej.c) ((fj.j) objQ);
                    boolean zH2 = i0Var2.h(r0Var);
                    Object objQ2 = i0Var2.Q();
                    if (zH2 || objQ2 == fVar) {
                        k0.h1 h1Var2 = new k0.h1(1, r0Var, r0.class, "persistGridLayout", "persistGridLayout(Ljava/util/List;)V", 0, 0, 5);
                        i0Var2.l0(h1Var2);
                        objQ2 = h1Var2;
                    }
                    ej.c cVar2 = (ej.c) ((fj.j) objQ2);
                    boolean zH3 = i0Var2.h(r0Var);
                    Object objQ3 = i0Var2.Q();
                    if (zH3 || objQ3 == fVar) {
                        a2.i iVar = new a2.i(0, r0Var, r0.class, "exportHomeScreenLayoutJson", "exportHomeScreenLayoutJson()Ljava/lang/String;", 0, 0, 9);
                        i0Var2.l0(iVar);
                        objQ3 = iVar;
                    }
                    ej.a aVar = (ej.a) ((fj.j) objQ3);
                    boolean zH4 = i0Var2.h(r0Var);
                    Object objQ4 = i0Var2.Q();
                    if (zH4 || objQ4 == fVar) {
                        k0.h1 h1Var3 = new k0.h1(1, r0Var, r0.class, "importHomeScreenLayoutJson", "importHomeScreenLayoutJson-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;", 0, 0, 6);
                        i0Var2.l0(h1Var3);
                        objQ4 = h1Var3;
                    }
                    ej.c cVar3 = (ej.c) ((fj.j) objQ4);
                    boolean zH5 = i0Var2.h(r0Var);
                    Object objQ5 = i0Var2.Q();
                    if (zH5 || objQ5 == fVar) {
                        k0.h1 h1Var4 = new k0.h1(1, r0Var, r0.class, "setBlurredWallpaper", "setBlurredWallpaper(Landroid/graphics/Bitmap;)V", 0, 0, 7);
                        i0Var2.l0(h1Var4);
                        objQ5 = h1Var4;
                    }
                    ej.c cVar4 = (ej.c) ((fj.j) objQ5);
                    boolean zH6 = i0Var2.h(r0Var);
                    Object objQ6 = i0Var2.Q();
                    if (zH6 || objQ6 == fVar) {
                        k0.h1 h1Var5 = new k0.h1(1, r0Var, r0.class, "extractFolderApps", "extractFolderApps(Ljava/lang/String;)V", 0, 0, 8);
                        i0Var2.l0(h1Var5);
                        objQ6 = h1Var5;
                    }
                    ej.c cVar5 = (ej.c) ((fj.j) objQ6);
                    boolean zH7 = i0Var2.h(r0Var) | i0Var2.h(context);
                    Object objQ7 = i0Var2.Q();
                    if (zH7 || objQ7 == fVar) {
                        objQ7 = new k0.t1(8, r0Var, context);
                        i0Var2.l0(objQ7);
                    }
                    ej.c cVar6 = (ej.c) objQ7;
                    boolean zH8 = i0Var2.h(r0Var);
                    Object objQ8 = i0Var2.Q();
                    if (zH8 || objQ8 == fVar) {
                        a0 a0Var = new a0(3, r0Var, r0.class, "resizeGridItem", "resizeGridItem(Ljava/lang/String;II)V", 0, 0);
                        i0Var2.l0(a0Var);
                        objQ8 = a0Var;
                    }
                    ej.f fVar2 = (ej.f) ((fj.j) objQ8);
                    boolean zH9 = i0Var2.h(r0Var);
                    Object objQ9 = i0Var2.Q();
                    if (zH9 || objQ9 == fVar) {
                        k0.h1 h1Var6 = new k0.h1(1, r0Var, r0.class, "onPinCodeVerified", "onPinCodeVerified(Ljava/lang/String;)V", 0, 0, 9);
                        i0Var2.l0(h1Var6);
                        objQ9 = h1Var6;
                    }
                    ej.c cVar7 = (ej.c) ((fj.j) objQ9);
                    boolean zH10 = i0Var2.h(r0Var);
                    Object objQ10 = i0Var2.Q();
                    if (zH10 || objQ10 == fVar) {
                        a2.i iVar2 = new a2.i(0, r0Var, r0.class, "onPinCodeCancelled", "onPinCodeCancelled()V", 0, 0, 8);
                        i0Var2.l0(iVar2);
                        objQ10 = iVar2;
                    }
                    ej.a aVar2 = (ej.a) ((fj.j) objQ10);
                    f1.a1 a1Var2 = this.f14091e;
                    boolean zF = i0Var2.f(a1Var2) | i0Var2.h(context);
                    Object objQ11 = i0Var2.Q();
                    if (zF || objQ11 == fVar) {
                        objQ11 = new k2(context, a1Var2, 4);
                        i0Var2.l0(objQ11);
                    }
                    b.b(gVar, this.f14089c, this.f14090d, localDateTime, cVar, cVar2, aVar, cVar3, cVar4, cVar5, cVar6, fVar2, cVar7, aVar2, (ej.a) objQ11, i0Var2, 6);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ n(r0 r0Var, tj.e0 e0Var, ej.c cVar, f1.a1 a1Var, q2 q2Var) {
        this.f14088b = r0Var;
        this.f14089c = e0Var;
        this.f14090d = cVar;
        this.f14091e = a1Var;
        this.f14092f = q2Var;
    }
}
