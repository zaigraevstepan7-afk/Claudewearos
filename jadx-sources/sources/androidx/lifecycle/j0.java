package androidx.lifecycle;

import android.content.Context;
import f1.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends vi.i implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1101a;

    /* renamed from: b, reason: collision with root package name */
    public int f1102b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1103c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1104d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1105e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1106f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1107z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1101a = i10;
        this.f1103c = obj;
        this.f1104d = obj2;
        this.f1105e = obj3;
        this.f1106f = obj4;
        this.f1107z = obj5;
        this.A = obj6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ej.c, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        int i10 = this.f1101a;
        Object obj2 = this.A;
        Object obj3 = this.f1107z;
        switch (i10) {
            case 0:
                return new j0((v) this.f1105e, (o) this.f1106f, (qj.z) obj3, (ab.s) obj2, cVar, 0);
            case 1:
                return new j0((Context) this.f1103c, (lb.g) this.f1104d, (f1.a1) this.f1105e, (f1.a1) this.f1106f, (f1.a1) obj3, (f1.a1) obj2, cVar, 1);
            case 2:
                return new j0((Context) this.f1103c, (f1.a1) this.f1104d, (f1.a1) this.f1105e, (f1.a1) this.f1106f, (f1) obj3, (f1.a1) obj2, cVar, 2);
            case 3:
                j0 j0Var = new j0((sj.g) this.f1105e, (t.c) this.f1106f, (f1.a1) obj3, (f1.a1) obj2, cVar, 3);
                j0Var.f1104d = obj;
                return j0Var;
            case 4:
                t.m0 m0Var = t.m0.f15231a;
                j0 j0Var2 = new j0((t.p0) obj3, (vi.i) obj2, cVar);
                j0Var2.f1106f = obj;
                return j0Var2;
            case 5:
                return new j0((f1.a1) this.f1103c, (t.c) this.f1104d, (t.c) this.f1105e, (t.c) this.f1106f, (t.c) obj3, (t.c) obj2, cVar, 5);
            default:
                j0 j0Var3 = new j0((p2.a0) this.f1104d, (ej.c) this.f1105e, (ej.c) this.f1106f, (ej.f) obj3, (ej.c) obj2, cVar);
                j0Var3.f1103c = obj;
                return j0Var3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1101a) {
        }
        return ((j0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01d4 -> B:92:0x01d8). Please report as a decompilation issue!!! */
    @Override // vi.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, ti.c cVar, int i10) {
        super(2, cVar);
        this.f1101a = i10;
        this.f1105e = obj;
        this.f1106f = obj2;
        this.f1107z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p2.a0 a0Var, ej.c cVar, ej.c cVar2, ej.f fVar, ej.c cVar3, ti.c cVar4) {
        super(2, cVar4);
        this.f1101a = 6;
        this.f1104d = a0Var;
        this.f1105e = cVar;
        this.f1106f = cVar2;
        this.f1107z = fVar;
        this.A = cVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(t.p0 p0Var, ej.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.f1101a = 4;
        t.m0 m0Var = t.m0.f15231a;
        this.f1107z = p0Var;
        this.A = (vi.i) cVar;
    }
}
