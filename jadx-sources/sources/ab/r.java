package ab;

import android.content.Context;
import android.content.pm.ResolveInfo;
import f1.a1;
import f1.f1;
import java.util.List;
import m5.p0;
import ra.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(ej.e eVar, ti.c cVar) {
        super(2, cVar);
        this.f332a = 16;
        this.f334c = (vi.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [ej.e, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f332a) {
            case 0:
                return new r((a) this.f333b, (a1) this.f334c, cVar, 0);
            case 1:
                r rVar = new r((hb.h) this.f334c, cVar, 1);
                rVar.f333b = obj;
                return rVar;
            case 2:
                r rVar2 = new r((p0) this.f334c, cVar, 2);
                rVar2.f333b = obj;
                return rVar2;
            case 3:
                return new r((ResolveInfo) this.f333b, (m9.a) this.f334c, cVar, 3);
            case 4:
                return new r((List) this.f333b, (ma.a) this.f334c, cVar, 4);
            case 5:
                return new r((Context) this.f333b, (List) this.f334c, cVar, 5);
            case 6:
                return new r((ej.a) this.f333b, (a1) this.f334c, cVar, 6);
            case 7:
                r rVar3 = new r((a7.e) this.f334c, cVar, 7);
                rVar3.f333b = obj;
                return rVar3;
            case 8:
                return new r((lb.g) this.f333b, (a1) this.f334c, cVar, 8);
            case 9:
                return new r((ib.g) this.f333b, (a1) this.f334c, cVar, 9);
            case 10:
                return new r((Context) this.f333b, (String) this.f334c, cVar, 10);
            case 11:
                r rVar4 = new r((Context) this.f334c, cVar, 11);
                rVar4.f333b = obj;
                return rVar4;
            case 12:
                return new r((r0) this.f333b, (String) this.f334c, cVar, 12);
            case 13:
                return new r((t1.t) this.f333b, (ra.c) this.f334c, cVar, 13);
            case 14:
                r rVar5 = new r((t0.g) this.f334c, cVar, 14);
                rVar5.f333b = obj;
                return rVar5;
            case 15:
                return new r((ej.c) this.f333b, (f1) this.f334c, cVar, 15);
            case 16:
                r rVar6 = new r((vi.i) this.f334c, cVar);
                rVar6.f333b = obj;
                return rVar6;
            default:
                return new r((ej.c) this.f333b, (g0.d) this.f334c, cVar, 17);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f332a) {
            case 0:
                r rVar = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                rVar.invokeSuspend(oVar);
                return oVar;
            case 1:
                r rVar2 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                rVar2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                return ((r) create((p0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 3:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 4:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 5:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 6:
                r rVar3 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar3 = pi.o.f13011a;
                rVar3.invokeSuspend(oVar3);
                return oVar3;
            case 7:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 8:
                r rVar4 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar4 = pi.o.f13011a;
                rVar4.invokeSuspend(oVar4);
                return oVar4;
            case 9:
                r rVar5 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar5 = pi.o.f13011a;
                rVar5.invokeSuspend(oVar5);
                return oVar5;
            case 10:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 11:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 12:
                r rVar6 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar6 = pi.o.f13011a;
                rVar6.invokeSuspend(oVar6);
                return oVar6;
            case 13:
                r rVar7 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar7 = pi.o.f13011a;
                rVar7.invokeSuspend(oVar7);
                return oVar7;
            case 14:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 15:
                r rVar8 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar8 = pi.o.f13011a;
                rVar8.invokeSuspend(oVar8);
                return oVar8;
            case 16:
                return ((r) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                r rVar9 = (r) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar9 = pi.o.f13011a;
                rVar9.invokeSuspend(oVar9);
                return oVar9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a0, code lost:
    
        r2.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029c, code lost:
    
        return r10.a();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v23, types: [ej.e, vi.i] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f332a = i10;
        this.f333b = obj;
        this.f334c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f332a = i10;
        this.f334c = obj;
    }
}
