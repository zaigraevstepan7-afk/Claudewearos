package d1;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import f1.j1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4527a;

    /* renamed from: b, reason: collision with root package name */
    public int f4528b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(ej.e eVar, ti.c cVar, w6.m mVar) {
        super(1, cVar);
        this.f4527a = 5;
        u6.e0 e0Var = u6.e0.f16694a;
        this.f4529c = mVar;
        this.f4530d = (vi.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [ej.e, vi.i] */
    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        int i10 = this.f4527a;
        Object obj = this.f4530d;
        switch (i10) {
            case 0:
                return new l((q) this.f4529c, (ej.f) obj, cVar, 0);
            case 1:
                return new l((m5.z) obj, cVar, 1);
            case 2:
                return new l((m5.c0) obj, cVar, 2);
            case 3:
                return new l((p0.h) this.f4529c, (r0.e) obj, cVar, 3);
            case 4:
                return new l((r0.c) this.f4529c, (r0.b) obj, cVar, 4);
            default:
                w6.m mVar = (w6.m) this.f4529c;
                u6.e0 e0Var = u6.e0.f16694a;
                return new l((ej.e) obj, cVar, mVar);
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ti.c cVar = (ti.c) obj;
        switch (this.f4527a) {
        }
        return ((l) create(cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v54, types: [w6.m] */
    /* JADX WARN: Type inference failed for: r1v15, types: [t1.v] */
    /* JADX WARN: Type inference failed for: r1v16, types: [t1.v] */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [ej.e, vi.i] */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Throwable th2;
        m5.p0 k0Var;
        FileInputStream fileInputStream;
        Throwable th3;
        p0.e eVar;
        switch (this.f4527a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f4528b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    q qVar = (q) this.f4529c;
                    j jVar = new j(qVar, 3);
                    ab.s sVar = new ab.s((ej.f) this.f4530d, qVar, null, 4);
                    this.f4528b = 1;
                    if (i.e(jVar, sVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 1:
                m5.z zVar = (m5.z) this.f4530d;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f4528b;
                try {
                } catch (Throwable th4) {
                    m5.o0 o0VarG = zVar.g();
                    this.f4529c = th4;
                    this.f4528b = 2;
                    Integer numA = o0VarG.a();
                    if (numA == aVar2) {
                        return aVar2;
                    }
                    th2 = th4;
                    obj = numA;
                }
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f4528b = 1;
                    obj = m5.z.f(zVar, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f4529c;
                        uk.c.R(obj);
                        k0Var = new m5.k0(th2, ((Number) obj).intValue());
                        return new pi.h(k0Var, Boolean.TRUE);
                    }
                    uk.c.R(obj);
                }
                k0Var = (m5.p0) obj;
                return new pi.h(k0Var, Boolean.TRUE);
            case 2:
                m5.c0 c0Var = (m5.c0) this.f4530d;
                ui.a aVar3 = ui.a.f17085a;
                ?? r2 = this.f4528b;
                p5.e eVar2 = p5.e.f12801a;
                boolean z2 = true;
                try {
                    try {
                        try {
                        } catch (FileNotFoundException unused) {
                            if (c0Var.f11271a.exists()) {
                                FileInputStream fileInputStream2 = new FileInputStream(c0Var.f11271a);
                                try {
                                    this.f4529c = fileInputStream2;
                                    this.f4528b = 2;
                                    p5.a aVarA = eVar2.a(fileInputStream2);
                                    if (aVarA == aVar3) {
                                        return aVar3;
                                    }
                                    fileInputStream = fileInputStream2;
                                    obj = aVarA;
                                } catch (Throwable th5) {
                                    fileInputStream = fileInputStream2;
                                    th3 = th5;
                                    try {
                                        throw th3;
                                    } catch (Throwable th6) {
                                        u6.v.n(fileInputStream, th3);
                                        throw th6;
                                    }
                                }
                            } else {
                                obj = new p5.a(z2);
                            }
                        }
                        if (r2 == 0) {
                            uk.c.R(obj);
                            FileInputStream fileInputStream3 = new FileInputStream(c0Var.f11271a);
                            this.f4529c = fileInputStream3;
                            this.f4528b = 1;
                            obj = eVar2.a(fileInputStream3);
                            r2 = fileInputStream3;
                            if (obj == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fileInputStream = (FileInputStream) this.f4529c;
                                try {
                                    uk.c.R(obj);
                                    u6.v.n(fileInputStream, null);
                                    return obj;
                                } catch (Throwable th7) {
                                    th3 = th7;
                                    throw th3;
                                }
                            }
                            FileInputStream fileInputStream4 = (FileInputStream) this.f4529c;
                            uk.c.R(obj);
                            r2 = fileInputStream4;
                        }
                        u6.v.n(r2, null);
                        return obj;
                    } catch (Exception e10) {
                        if (e10 instanceof FileNotFoundException) {
                            throw x8.a.Z(c0Var.f11271a.getParent(), (FileNotFoundException) e10);
                        }
                        throw e10;
                    }
                } finally {
                }
            case 3:
                p0.h hVar = (p0.h) this.f4529c;
                ?? handler = hVar.f12610e;
                View view = hVar.f12606a;
                ui.a aVar4 = ui.a.f17085a;
                int i12 = this.f4528b;
                pi.o oVar = pi.o.f13011a;
                try {
                    if (i12 == 0) {
                        uk.c.R(obj);
                        p0.f fVar = new p0.f();
                        r0.e eVar3 = (r0.e) this.f4530d;
                        p0.e eVar4 = new p0.e(fVar, new p0.b(hVar, eVar3, 0), new p0.b(hVar, eVar3, 1), view);
                        ej.c cVar = hVar.f12607b;
                        if (cVar != null && (eVar = (p0.e) cVar.invoke(eVar4)) != null) {
                            eVar4 = eVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper == (handler2 != null ? handler2.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new p0.m(eVar4), 1);
                            if (actionModeStartActionMode != null) {
                                hVar.f12613h = actionModeStartActionMode;
                            }
                            return oVar;
                        }
                        p0.g gVar = hVar.f12614i;
                        if (gVar == null) {
                            gVar = new p0.g(hVar, eVar4, fVar, 0);
                            hVar.f12614i = gVar;
                        }
                        view.post(gVar);
                        this.f4528b = 1;
                        Object objC = fVar.f12601a.c(this);
                        if (objC != aVar4) {
                            objC = oVar;
                        }
                        if (objC == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                    }
                    if (Looper.myLooper() != (handler != 0 ? handler.getLooper() : null)) {
                        Runnable oVar2 = hVar.j;
                        if (oVar2 == null) {
                            oVar2 = new ac.o(hVar, 15);
                            hVar.j = oVar2;
                        }
                        view.post(oVar2);
                    } else {
                        ActionMode actionMode = hVar.f12613h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    p0.g gVar2 = hVar.f12614i;
                    if (gVar2 != null) {
                        view.removeCallbacks(gVar2);
                    }
                    hVar.f12613h = null;
                    return oVar;
                } finally {
                    handler.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable oVar3 = hVar.j;
                        if (oVar3 == null) {
                            oVar3 = new ac.o(hVar, 15);
                            hVar.j = oVar3;
                        }
                        view.post(oVar3);
                    } else {
                        ActionMode actionMode2 = hVar.f12613h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    p0.g gVar3 = hVar.f12614i;
                    if (gVar3 != null) {
                        view.removeCallbacks(gVar3);
                    }
                    hVar.f12613h = null;
                }
            case 4:
                r0.b bVar = (r0.b) this.f4530d;
                j1 j1Var = ((r0.c) this.f4529c).f13659c;
                ui.a aVar5 = ui.a.f17085a;
                int i13 = this.f4528b;
                pi.o oVar4 = pi.o.f13011a;
                try {
                    if (i13 == 0) {
                        uk.c.R(obj);
                        j1Var.setValue(bVar);
                        this.f4528b = 1;
                        Object objC2 = bVar.f13656b.c(this);
                        if (objC2 != aVar5) {
                            objC2 = oVar4;
                        }
                        if (objC2 == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                    }
                    return oVar4;
                } finally {
                    j1Var.setValue(null);
                }
            default:
                ui.a aVar6 = ui.a.f17085a;
                int i14 = this.f4528b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                uk.c.R(obj);
                ?? r14 = (w6.m) this.f4529c;
                u6.e0 e0Var = u6.e0.f16695b;
                ?? r32 = (vi.i) this.f4530d;
                this.f4528b = 1;
                Object objD = r14.d(e0Var, r32, this);
                return objD == aVar6 ? aVar6 : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, ti.c cVar, int i10) {
        super(1, cVar);
        this.f4527a = i10;
        this.f4529c = obj;
        this.f4530d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, ti.c cVar, int i10) {
        super(1, cVar);
        this.f4527a = i10;
        this.f4530d = obj;
    }
}
