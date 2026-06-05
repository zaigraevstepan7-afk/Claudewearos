package b6;

import android.content.Context;
import android.graphics.Rect;
import androidx.lifecycle.v;
import f1.a1;
import f1.a2;
import f1.f1;
import f1.p1;
import f1.s;
import f1.z1;
import g0.h0;
import h8.r;
import java.util.ArrayList;
import java.util.List;
import k0.l1;
import k0.s1;
import k0.t0;
import l3.t;
import l3.u;
import p2.a0;
import pi.o;
import qj.z;
import t0.l;
import ta.n;
import v0.u0;
import w2.i0;
import wa.l0;
import wa.q0;
import x.a3;
import x.j2;
import x.l2;
import x.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1581a;

    /* renamed from: b, reason: collision with root package name */
    public int f1582b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1583c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1584d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1585e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1586f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1587z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1581a = i10;
        this.f1583c = obj;
        this.f1584d = obj2;
        this.f1585e = obj3;
        this.f1586f = obj4;
        this.f1587z = obj5;
    }

    private final Object h(Object obj) {
        q0 q0Var;
        n nVar;
        a1 a1Var = (a1) this.f1584d;
        f1 f1Var = (f1) this.f1587z;
        f1 f1Var2 = (f1) this.f1586f;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f1582b;
        if (i10 == 0) {
            uk.c.R(obj);
            a1 a1Var2 = (a1) this.f1583c;
            float f10 = l0.f19120a;
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
            }
            return o.f13011a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uk.c.R(obj);
        do {
            float f11 = l0.f19120a;
            if (((q0) a1Var.getValue()) == null || (q0Var = (q0) a1Var.getValue()) == null) {
                return o.f13011a;
            }
            Rect rect = (Rect) ((a1) this.f1585e).getValue();
            float f12 = (q0Var.f19139c - q0Var.f19143g) - (rect != null ? rect.left : 0);
            float f13 = (q0Var.f19140d - q0Var.f19144h) - (rect != null ? rect.top : 0);
            f1Var2.h(((f12 - f1Var2.g()) * 0.45f) + f1Var2.g());
            f1Var.h(((f13 - f1Var.g()) * 0.45f) + f1Var.g());
            if (Math.abs(f12 - f1Var2.g()) < 0.5f) {
                f1Var2.h(f12);
            }
            if (Math.abs(f13 - f1Var.g()) < 0.5f) {
                f1Var.h(f13);
            }
            nVar = new n(16);
            this.f1582b = 1;
        } while (s.v(getContext()).a(nVar, this) != aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:15:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c.i(java.lang.Object):java.lang.Object");
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1581a) {
            case 0:
                c cVar2 = new c((v) this.f1584d, (androidx.lifecycle.o) this.f1585e, (ti.h) this.f1586f, (tj.e) this.f1587z, cVar, 0);
                cVar2.f1583c = obj;
                return cVar2;
            case 1:
                return new c((t.c) this.f1583c, (t.s) this.f1584d, (ej.c) this.f1585e, (f1) this.f1586f, (f1) this.f1587z, cVar, 1);
            case 2:
                c cVar3 = new c((a2) this.f1585e, (z1) this.f1586f, (f1.e) this.f1587z, cVar, 2);
                cVar3.f1583c = obj;
                return cVar3;
            case 3:
                c cVar4 = new c((ej.a) this.f1587z, cVar, 3);
                cVar4.f1586f = obj;
                return cVar4;
            case 4:
                return new c((ej.a) this.f1583c, (kj.d) this.f1584d, (hb.h) this.f1585e, (a1) this.f1586f, (a1) this.f1587z, cVar, 4);
            case 5:
                return new c((r8.g) this.f1583c, (r) this.f1584d, (s8.h) this.f1585e, (h8.f) this.f1586f, (h8.j) this.f1587z, cVar, 5);
            case 6:
                return new c((t0) this.f1583c, (a1) this.f1584d, (u) this.f1585e, (u0) this.f1586f, (l3.j) this.f1587z, cVar, 6);
            case 7:
                return new c((h0.c) this.f1583c, (t) this.f1584d, (t0) this.f1585e, (s1) this.f1586f, (l3.n) this.f1587z, cVar, 7);
            case 8:
                c cVar5 = new c((l9.a) this.f1587z, cVar, 8);
                cVar5.f1583c = obj;
                return cVar5;
            case 9:
                c cVar6 = new c((List) this.f1586f, (ArrayList) this.f1587z, cVar);
                cVar6.f1585e = obj;
                return cVar6;
            case 10:
                return new c((Context) this.f1583c, (List) this.f1584d, (h0) this.f1585e, (List) this.f1586f, (a1) this.f1587z, cVar, 10);
            case 11:
                return new c((ma.a) this.f1584d, (ib.g) this.f1585e, (a1) this.f1586f, (a1) this.f1587z, cVar, 11);
            case 12:
                c cVar7 = new c((a1) this.f1585e, (a1) this.f1586f, (Context) this.f1587z, cVar, 12);
                cVar7.f1583c = obj;
                return cVar7;
            case 13:
                c cVar8 = new c((i0) this.f1584d, (ej.c) this.f1585e, (t0.a) this.f1586f, (l) this.f1587z, cVar, 13);
                cVar8.f1583c = obj;
                return cVar8;
            case 14:
                return new c((va.u) this.f1583c, (ej.c) this.f1584d, (String) this.f1585e, (a1) this.f1586f, (a1) this.f1587z, cVar, 14);
            case 15:
                return new c((a1) this.f1583c, (a1) this.f1584d, (a1) this.f1585e, (f1) this.f1586f, (f1) this.f1587z, cVar, 15);
            case 16:
                c cVar9 = new c((a0) this.f1584d, (l1) this.f1585e, (ab.i) this.f1586f, (r1) this.f1587z, cVar, 16);
                cVar9.f1583c = obj;
                return cVar9;
            case 17:
                c cVar10 = new c((a3) this.f1585e, (l2) this.f1586f, (fj.v) this.f1587z, cVar, 17);
                cVar10.f1583c = obj;
                return cVar10;
            default:
                return new c((f1) this.f1583c, (f1) this.f1584d, (f1) this.f1585e, (f1) this.f1586f, (f1) this.f1587z, cVar, 18);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1581a) {
            case 0:
                return ((c) create((p1) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 1:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 2:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 3:
                ((c) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
                return ui.a.f17085a;
            case 4:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 5:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 6:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 7:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 8:
                return ((c) create((tj.f) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 9:
                return ((c) create(obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 10:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 11:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 12:
                return ((c) create((p1) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 13:
                ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
                return ui.a.f17085a;
            case 14:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 15:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 16:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 17:
                return ((c) create((j2) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            default:
                return ((c) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:281:0x0640, B:286:0x065b], limit reached: 451 */
    /* JADX WARN: Path cross not found for [B:286:0x065b, B:281:0x0640], limit reached: 451 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0651 A[Catch: all -> 0x05f6, PHI: r3 r4 r5 r6
      0x0651: PHI (r3v32 java.lang.Object) = (r3v31 java.lang.Object), (r3v36 java.lang.Object) binds: [B:282:0x064e, B:275:0x060f] A[DONT_GENERATE, DONT_INLINE]
      0x0651: PHI (r4v17 ??) = (r4v83 ??), (r4v84 ??) binds: [B:282:0x064e, B:275:0x060f] A[DONT_GENERATE, DONT_INLINE]
      0x0651: PHI (r5v27 ??) = (r5v80 ??), (r5v81 ??) binds: [B:282:0x064e, B:275:0x060f] A[DONT_GENERATE, DONT_INLINE]
      0x0651: PHI (r6v16 tj.f) = (r6v15 tj.f), (r6v20 tj.f) binds: [B:282:0x064e, B:275:0x060f] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x05f6, blocks: (B:275:0x060f, B:284:0x0651, B:281:0x0640, B:286:0x065b, B:268:0x05f2, B:278:0x062b), top: B:446:0x05dc }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x065b A[Catch: all -> 0x05f6, TRY_LEAVE, TryCatch #7 {all -> 0x05f6, blocks: (B:275:0x060f, B:284:0x0651, B:281:0x0640, B:286:0x065b, B:268:0x05f2, B:278:0x062b), top: B:446:0x05dc }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10, types: [t1.f] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, t1.f] */
    /* JADX WARN: Type inference failed for: r2v33, types: [f0.i0] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, qj.e1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [sj.g] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, sj.g] */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v24, types: [ag.i] */
    /* JADX WARN: Type inference failed for: r5v27, types: [ag.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0659 -> B:281:0x0640). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:289:0x066c -> B:281:0x0640). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1581a = i10;
        this.f1584d = obj;
        this.f1585e = obj2;
        this.f1586f = obj3;
        this.f1587z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1581a = i10;
        this.f1585e = obj;
        this.f1586f = obj2;
        this.f1587z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1581a = i10;
        this.f1587z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, ArrayList arrayList, ti.c cVar) {
        super(2, cVar);
        this.f1581a = 9;
        this.f1586f = list;
        this.f1587z = arrayList;
    }
}
