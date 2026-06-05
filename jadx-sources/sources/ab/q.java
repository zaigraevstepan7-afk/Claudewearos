package ab;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import f1.a1;
import f1.a2;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import t.h0;
import tj.o0;
import tj.r0;
import w2.i0;
import w2.q2;
import x.a3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* renamed from: b, reason: collision with root package name */
    public int f327b;

    /* renamed from: c, reason: collision with root package name */
    public Object f328c;

    /* renamed from: d, reason: collision with root package name */
    public Object f329d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, a1 a1Var, a1 a1Var2, a1 a1Var3, ti.c cVar) {
        super(2, cVar);
        this.f326a = 5;
        this.f328c = context;
        this.f331f = a1Var;
        this.f329d = a1Var2;
        this.f330e = a1Var3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ej.c, fj.m] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f326a) {
            case 0:
                return new q((a) this.f328c, (t.c) this.f329d, (t.c) this.f330e, (a1) this.f331f, cVar, 0);
            case 1:
                return new q((yj.c) this.f330e, (s) this.f331f, cVar, 1);
            case 2:
                q qVar = new q((androidx.lifecycle.v) this.f329d, (androidx.lifecycle.o) this.f330e, (s) this.f331f, cVar, 2);
                qVar.f328c = obj;
                return qVar;
            case 3:
                return new q((c3.c) this.f328c, (ScrollCaptureSession) this.f329d, (Rect) this.f330e, (Consumer) this.f331f, cVar, 3);
            case 4:
                q qVar2 = new q((Uri) this.f330e, (Context) this.f331f, cVar, 4);
                qVar2.f329d = obj;
                return qVar2;
            case 5:
                return new q((Context) this.f328c, (a1) this.f331f, (a1) this.f329d, (a1) this.f330e, cVar);
            case 6:
                q qVar3 = new q((Context) this.f330e, (mb.b) this.f331f, cVar, 6);
                qVar3.f329d = obj;
                return qVar3;
            case 7:
                return new q(this.f328c, (t.c) this.f329d, (a1) this.f331f, (a1) this.f330e, cVar);
            case 8:
                q qVar4 = new q((a1) this.f331f, (h0) this.f330e, cVar);
                qVar4.f329d = obj;
                return qVar4;
            case 9:
                q qVar5 = new q((ej.c) this.f329d, (t0.a) this.f330e, (t0.l) this.f331f, cVar, 9);
                qVar5.f328c = obj;
                return qVar5;
            case 10:
                q qVar6 = new q((tj.e) this.f329d, (r0) this.f330e, (Float) this.f331f, cVar, 10);
                qVar6.f328c = obj;
                return qVar6;
            case 11:
                return new q((o0) this.f328c, (tj.e) this.f329d, (r0) this.f330e, (Float) this.f331f, cVar, 11);
            case 12:
                q qVar7 = new q((u6.u) this.f329d, (qj.l) this.f330e, (t0.f) this.f331f, cVar, 12);
                qVar7.f328c = obj;
                return qVar7;
            case 13:
                return new q((v0.p) this.f330e, (ej.e) this.f331f, cVar);
            case 14:
                q qVar8 = new q((ej.c) this.f329d, (AtomicReference) this.f330e, (ej.e) this.f331f, cVar);
                qVar8.f328c = obj;
                return qVar8;
            case 15:
                return new q((fj.v) this.f328c, (a2) this.f329d, (androidx.lifecycle.t) this.f330e, (q2) this.f331f, cVar, 15);
            default:
                q qVar9 = new q((a3) this.f331f, cVar);
                qVar9.f330e = obj;
                return qVar9;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f326a) {
            case 8:
                ((q) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
            case 9:
                ((q) create((i0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
        }
        return ((q) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:211:0x03d6, B:218:0x040d], limit reached: 380 */
    /* JADX WARN: Path cross not found for [B:218:0x040d, B:211:0x03d6], limit reached: 380 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [ej.c, fj.m] */
    /* JADX WARN: Type inference failed for: r1v92, types: [ti.e] */
    /* JADX WARN: Type inference failed for: r2v56, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r9v9, types: [ej.e, vi.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x040b -> B:211:0x03d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0425 -> B:211:0x03d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007e -> B:19:0x004b). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(ej.c cVar, AtomicReference atomicReference, ej.e eVar, ti.c cVar2) {
        super(2, cVar2);
        this.f326a = 14;
        this.f329d = (fj.m) cVar;
        this.f330e = atomicReference;
        this.f331f = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a1 a1Var, h0 h0Var, ti.c cVar) {
        super(2, cVar);
        this.f326a = 8;
        this.f331f = a1Var;
        this.f330e = h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, ti.c cVar, int i10) {
        super(2, cVar);
        this.f326a = i10;
        this.f328c = obj;
        this.f329d = obj2;
        this.f330e = obj3;
        this.f331f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f326a = i10;
        this.f329d = obj;
        this.f330e = obj2;
        this.f331f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f326a = i10;
        this.f330e = obj;
        this.f331f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj, t.c cVar, a1 a1Var, a1 a1Var2, ti.c cVar2) {
        super(2, cVar2);
        this.f326a = 7;
        this.f328c = obj;
        this.f329d = cVar;
        this.f331f = a1Var;
        this.f330e = a1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(v0.p pVar, ej.e eVar, ti.c cVar) {
        super(2, cVar);
        this.f326a = 13;
        this.f330e = pVar;
        this.f331f = (vi.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a3 a3Var, ti.c cVar) {
        super(2, cVar);
        this.f326a = 16;
        this.f331f = a3Var;
    }
}
