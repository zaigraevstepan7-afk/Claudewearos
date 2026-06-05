package k3;

import f1.j1;
import f1.q2;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f9368a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9369b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.c f9370c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f9371d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9372e = true;

    public d(List list, Object obj, b0 b0Var, ac.d dVar, ej.c cVar, a aVar) {
        this.f9368a = list;
        this.f9369b = b0Var;
        this.f9370c = cVar;
        this.f9371d = f1.s.A(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0033, B:34:0x0098, B:21:0x004a, B:23:0x004f, B:27:0x0075, B:32:0x008e), top: B:39:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0098 -> B:35:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vi.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof k3.c
            if (r0 == 0) goto L13
            r0 = r13
            k3.c r0 = (k3.c) r0
            int r1 = r0.f9366z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9366z = r1
            goto L18
        L13:
            k3.c r0 = new k3.c
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f9364e
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f9366z
            pi.o r3 = pi.o.f13011a
            ej.c r4 = r12.f9370c
            f1.j1 r5 = r12.f9371d
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L8b
            r8 = 2
            if (r2 == r6) goto L42
            if (r2 != r8) goto L3a
            int r1 = r0.f9363d
            int r2 = r0.f9362c
            java.util.List r8 = r0.f9360a
            uk.c.R(r13)     // Catch: java.lang.Throwable -> L37
            goto La1
        L37:
            r13 = move-exception
            goto Lb7
        L3a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L42:
            int r2 = r0.f9363d
            int r9 = r0.f9362c
            k3.y r10 = r0.f9361b
            java.util.List r11 = r0.f9360a
            uk.c.R(r13)     // Catch: java.lang.Throwable -> L37
            if (r13 == 0) goto L75
            k3.b0 r1 = r12.f9369b     // Catch: java.lang.Throwable -> L37
            int r2 = r1.f9358d     // Catch: java.lang.Throwable -> L37
            k3.s r6 = r1.f9356b     // Catch: java.lang.Throwable -> L37
            int r1 = r1.f9357c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r13 = uk.c.Q(r2, r13, r10, r6, r1)     // Catch: java.lang.Throwable -> L37
            r5.setValue(r13)     // Catch: java.lang.Throwable -> L37
            ti.h r13 = r0.getContext()
            boolean r13 = qj.b0.t(r13)
            r12.f9372e = r7
            k3.d0 r0 = new k3.d0
            java.lang.Object r1 = r5.getValue()
            r0.<init>(r1, r13)
        L71:
            r4.invoke(r0)
            return r3
        L75:
            r0.f9360a = r11     // Catch: java.lang.Throwable -> L37
            r13 = 0
            r0.f9361b = r13     // Catch: java.lang.Throwable -> L37
            r0.f9362c = r9     // Catch: java.lang.Throwable -> L37
            r0.f9363d = r2     // Catch: java.lang.Throwable -> L37
            r0.f9366z = r8     // Catch: java.lang.Throwable -> L37
            java.lang.Object r13 = qj.b0.J(r0)     // Catch: java.lang.Throwable -> L37
            if (r13 != r1) goto L87
            return r1
        L87:
            r1 = r2
            r2 = r9
            r8 = r11
            goto La1
        L8b:
            uk.c.R(r13)
            java.util.List r13 = r12.f9368a     // Catch: java.lang.Throwable -> L37
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L37
            r8 = r13
            r2 = r7
        L96:
            if (r2 >= r1) goto La3
            java.lang.Object r13 = r8.get(r2)     // Catch: java.lang.Throwable -> L37
            k3.y r13 = (k3.y) r13     // Catch: java.lang.Throwable -> L37
            r13.getClass()     // Catch: java.lang.Throwable -> L37
        La1:
            int r2 = r2 + r6
            goto L96
        La3:
            ti.h r13 = r0.getContext()
            boolean r13 = qj.b0.t(r13)
            r12.f9372e = r7
            k3.d0 r0 = new k3.d0
            java.lang.Object r1 = r5.getValue()
            r0.<init>(r1, r13)
            goto L71
        Lb7:
            ti.h r0 = r0.getContext()
            boolean r0 = qj.b0.t(r0)
            r12.f9372e = r7
            k3.d0 r1 = new k3.d0
            java.lang.Object r2 = r5.getValue()
            r1.<init>(r2, r0)
            r4.invoke(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.b(vi.c):java.lang.Object");
    }

    @Override // f1.q2
    public final Object getValue() {
        return this.f9371d.getValue();
    }
}
