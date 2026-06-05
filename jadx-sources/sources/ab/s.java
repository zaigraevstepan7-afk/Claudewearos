package ab;

import a2.d0;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c1.j8;
import com.google.android.gms.internal.ads.zzbch;
import d1.v0;
import f1.a1;
import f1.g1;
import f1.p1;
import f1.q2;
import f1.z1;
import qj.o0;
import ra.r0;
import t.j1;
import u6.n0;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f335a;

    /* renamed from: b, reason: collision with root package name */
    public int f336b;

    /* renamed from: c, reason: collision with root package name */
    public Object f337c;

    /* renamed from: d, reason: collision with root package name */
    public Object f338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f335a = i10;
        this.f337c = obj;
        this.f338d = obj2;
        this.f339e = obj3;
    }

    private final Object h(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f336b;
        if (i10 == 0) {
            uk.c.R(obj);
            z.k kVar = (z.k) this.f337c;
            z.j jVar = (z.j) this.f338d;
            this.f336b = 1;
            if (kVar.a(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        o0 o0Var = (o0) this.f339e;
        if (o0Var != null) {
            o0Var.a();
        }
        return pi.o.f13011a;
    }

    private final Object i(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f336b;
        if (i10 == 0) {
            uk.c.R(obj);
            qj.z zVar = (qj.z) this.f337c;
            m5.n nVarN = f1.s.N(new v0((q2) this.f338d, 4));
            b1.g gVar = new b1.g(8, (t.c) this.f339e, zVar);
            this.f336b = 1;
            if (nVarN.c(gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x003b, B:19:0x0043, B:20:0x0051, B:26:0x005f, B:14:0x002e, B:28:0x0062, B:30:0x0067, B:31:0x0068, B:13:0x0028, B:21:0x0052, B:23:0x0058), top: B:47:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Type inference failed for: r4v6, types: [sj.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r8) {
        /*
            r7 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r7.f336b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r1 = r7.f338d
            sj.b r1 = (sj.b) r1
            java.lang.Object r4 = r7.f337c
            sj.q r4 = (sj.q) r4
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L16
            goto L3b
        L16:
            r8 = move-exception
            goto L6f
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            uk.c.R(r8)
            java.lang.Object r8 = r7.f339e
            r4 = r8
            sj.c r4 = (sj.c) r4
            sj.b r8 = new sj.b     // Catch: java.lang.Throwable -> L16
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L16
            r1 = r8
        L2e:
            r7.f337c = r4     // Catch: java.lang.Throwable -> L16
            r7.f338d = r1     // Catch: java.lang.Throwable -> L16
            r7.f336b = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L69
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L16
            pi.o r8 = (pi.o) r8     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r8 = w2.k1.f18310b     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = t1.m.f15471c     // Catch: java.lang.Throwable -> L16
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L16
            t1.a r6 = t1.m.j     // Catch: java.lang.Throwable -> L66
            q.h0 r6 = r6.f15411h     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5f
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L66
            if (r6 != r3) goto L5f
            r5 = r3
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L2e
            t1.m.a()     // Catch: java.lang.Throwable -> L16
            goto L2e
        L66:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L69:
            r4.e(r2)
            pi.o r8 = pi.o.f13011a
            return r8
        L6f:
            throw r8     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L78
            r2 = r8
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L78:
            if (r2 != 0) goto L84
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            r2.<init>(r1)
            r2.initCause(r8)
        L84:
            r4.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.s.j(java.lang.Object):java.lang.Object");
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f335a) {
            case 0:
                return new s((a) this.f337c, (a) this.f338d, (t.c) this.f339e, cVar, 0);
            case 1:
                return new s((ti.h) this.f337c, (tj.e) this.f338d, (p1) this.f339e, cVar, 1);
            case 2:
                return new s((ej.e) this.f337c, this.f338d, (qj.z) this.f339e, cVar, 2);
            case 3:
                s sVar = new s((ej.a) this.f338d, (ej.e) this.f339e, cVar, 3);
                sVar.f337c = obj;
                return sVar;
            case 4:
                s sVar2 = new s((ej.f) this.f338d, (d1.q) this.f339e, cVar, 4);
                sVar2.f337c = obj;
                return sVar2;
            case 5:
                s sVar3 = new s((ej.g) this.f338d, (d1.q) this.f339e, cVar, 5);
                sVar3.f337c = obj;
                return sVar3;
            case 6:
                return new s((tj.b0) this.f338d, (j8) this.f339e, cVar, 6);
            case 7:
                s sVar4 = new s((z1) this.f338d, (f1.e) this.f339e, cVar, 7);
                sVar4.f337c = obj;
                return sVar4;
            case 8:
                s sVar5 = new s((ti.h) this.f338d, (tj.e) this.f339e, cVar, 8);
                sVar5.f337c = obj;
                return sVar5;
            case 9:
                return new s((g1) this.f337c, (hb.h) this.f338d, (ej.c) this.f339e, cVar, 9);
            case 10:
                return new s((h0.h) this.f337c, (i1) this.f338d, (d0) this.f339e, cVar, 10);
            case 11:
                s sVar6 = new s((h8.r) this.f338d, (r8.g) this.f339e, cVar, 11);
                sVar6.f337c = obj;
                return sVar6;
            case 12:
                return new s((i8.i) this.f338d, (i8.c) this.f339e, cVar, 12);
            case 13:
                s sVar7 = new s((m5.z) this.f339e, cVar, 13);
                sVar7.f338d = obj;
                return sVar7;
            case 14:
                return new s((Context) this.f337c, (String) this.f338d, (Uri) this.f339e, cVar, 14);
            case 15:
                return new s((n6.a) this.f337c, (Uri) this.f338d, (InputEvent) this.f339e, cVar, 15);
            case 16:
                return new s((q0.l) this.f338d, (r0.f) this.f339e, cVar, 16);
            case 17:
                s sVar8 = new s((a1) this.f338d, (Context) this.f339e, cVar, 17);
                sVar8.f337c = obj;
                return sVar8;
            case 18:
                s sVar9 = new s((r0) this.f339e, cVar, 18);
                sVar9.f338d = obj;
                return sVar9;
            case 19:
                return new s(this.f337c, (t.c) this.f339e, this.f338d, cVar, 19);
            case 20:
                return new s(this.f337c, (t.c) this.f339e, this.f338d, cVar, 20);
            case zzbch.zzt.zzm /* 21 */:
                s sVar10 = new s((j1) this.f338d, (a1) this.f339e, cVar, 21);
                sVar10.f337c = obj;
                return sVar10;
            case 22:
                return new s(this.f337c, (t.c) this.f339e, this.f338d, cVar, 22);
            case 23:
                s sVar11 = new s((n0) this.f339e, cVar, 23);
                sVar11.f338d = obj;
                return sVar11;
            case 24:
                s sVar12 = new s((tj.f) this.f338d, (uj.f) this.f339e, cVar, 24);
                sVar12.f337c = obj;
                return sVar12;
            case 25:
                return new s((z.k) this.f337c, (z.l) this.f338d, (o0) this.f339e, cVar, 25);
            case 26:
                return new s((z.k) this.f337c, (z.j) this.f338d, (o0) this.f339e, cVar, 26);
            case 27:
                s sVar13 = new s((q2) this.f338d, (t.c) this.f339e, cVar, 27);
                sVar13.f337c = obj;
                return sVar13;
            case 28:
                return new s((sj.c) this.f339e, cVar, 28);
            default:
                return new s((fj.v) this.f338d, (w6.r) this.f339e, cVar, 29);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f335a) {
        }
        return ((s) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:635:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v59, types: [qj.a, sj.o] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ti.c] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [h2.b] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f335a = i10;
        this.f338d = obj;
        this.f339e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, t.c cVar, Object obj2, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f335a = i10;
        this.f337c = obj;
        this.f339e = cVar;
        this.f338d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f335a = i10;
        this.f339e = obj;
    }
}
