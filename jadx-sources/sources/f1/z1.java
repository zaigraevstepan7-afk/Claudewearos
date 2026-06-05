package f1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z1 extends vi.i implements ej.f {
    public q.h0 A;
    public int B;
    public /* synthetic */ e C;
    public final /* synthetic */ a2 D;

    /* renamed from: a, reason: collision with root package name */
    public List f6504a;

    /* renamed from: b, reason: collision with root package name */
    public List f6505b;

    /* renamed from: c, reason: collision with root package name */
    public List f6506c;

    /* renamed from: d, reason: collision with root package name */
    public q.h0 f6507d;

    /* renamed from: e, reason: collision with root package name */
    public q.h0 f6508e;

    /* renamed from: f, reason: collision with root package name */
    public q.h0 f6509f;

    /* renamed from: z, reason: collision with root package name */
    public Set f6510z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, ti.c cVar) {
        super(3, cVar);
        this.D = a2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(f1.a2 r22, java.util.List r23, java.util.List r24, java.util.List r25, q.h0 r26, q.h0 r27, q.h0 r28, q.h0 r29) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.z1.h(f1.a2, java.util.List, java.util.List, java.util.List, q.h0, q.h0, q.h0, q.h0):void");
    }

    public static final void i(List list, a2 a2Var) {
        list.clear();
        synchronized (a2Var.f6246c) {
            try {
                ArrayList arrayList = a2Var.f6253k;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((v0) arrayList.get(i10));
                }
                a2Var.f6253k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        z1 z1Var = new z1(this.D, (ti.c) obj3);
        z1Var.C = (e) obj2;
        z1Var.invokeSuspend(pi.o.f13011a);
        return ui.a.f17085a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0125 -> B:44:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01db -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
