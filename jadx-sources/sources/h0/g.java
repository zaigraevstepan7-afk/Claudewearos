package h0;

import a2.d0;
import android.graphics.Bitmap;
import c1.r3;
import ja.j;
import java.util.ArrayList;
import pi.o;
import qj.z;
import ra.r0;
import v2.i1;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7566a = 0;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7571f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, i1 i1Var, d0 d0Var, r3 r3Var, ti.c cVar) {
        super(2, cVar);
        this.f7568c = hVar;
        this.f7569d = i1Var;
        this.f7570e = d0Var;
        this.f7571f = r3Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7566a) {
            case 0:
                g gVar = new g((h) this.f7568c, (i1) this.f7569d, (d0) this.f7570e, (r3) this.f7571f, cVar);
                gVar.f7567b = obj;
                return gVar;
            default:
                return new g((r0) this.f7567b, (String) this.f7568c, (j) this.f7569d, (Bitmap) this.f7570e, (ArrayList) this.f7571f, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7566a) {
            case 0:
                return ((g) create(zVar, cVar)).invokeSuspend(o.f13011a);
            default:
                g gVar = (g) create(zVar, cVar);
                o oVar = o.f13011a;
                gVar.invokeSuspend(oVar);
                return oVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r0 r0Var, String str, j jVar, Bitmap bitmap, ArrayList arrayList, ti.c cVar) {
        super(2, cVar);
        this.f7567b = r0Var;
        this.f7568c = str;
        this.f7569d = jVar;
        this.f7570e = bitmap;
        this.f7571f = arrayList;
    }
}
