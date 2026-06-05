package m5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11392b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11393c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fj.v vVar, z zVar, fj.t tVar, ti.c cVar) {
        super(1, cVar);
        this.f11394d = vVar;
        this.f11395e = zVar;
        this.f11396f = tVar;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        switch (this.f11391a) {
            case 0:
                return new w((fj.v) this.f11394d, (z) this.f11395e, (fj.t) this.f11396f, cVar);
            default:
                return new w((i0) this.f11395e, this.f11396f, cVar);
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ti.c cVar = (ti.c) obj;
        switch (this.f11391a) {
        }
        return ((w) create(cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Exception {
        fj.v vVar;
        fj.t tVar;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileOutputStream fileOutputStream2;
        switch (this.f11391a) {
            case 0:
                fj.t tVar2 = (fj.t) this.f11396f;
                fj.v vVar2 = (fj.v) this.f11394d;
                z zVar = (z) this.f11395e;
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f11392b;
                try {
                } catch (b unused) {
                    Object obj2 = vVar2.f6807a;
                    this.f11393c = tVar2;
                    this.f11392b = 3;
                    obj = zVar.i(obj2, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f11393c = vVar2;
                    this.f11392b = 1;
                    obj = zVar.h(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            tVar = (fj.t) ((Serializable) this.f11393c);
                            uk.c.R(obj);
                            tVar.f6805a = ((Number) obj).intValue();
                            return pi.o.f13011a;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tVar2 = (fj.t) ((Serializable) this.f11393c);
                        uk.c.R(obj);
                        tVar2.f6805a = ((Number) obj).intValue();
                        return pi.o.f13011a;
                    }
                    vVar = (fj.v) ((Serializable) this.f11393c);
                    uk.c.R(obj);
                }
                vVar.f6807a = obj;
                o0 o0VarG = zVar.g();
                this.f11393c = tVar2;
                this.f11392b = 2;
                obj = o0VarG.a();
                if (obj == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                tVar.f6805a = ((Number) obj).intValue();
                return pi.o.f13011a;
            default:
                File file = ((i0) this.f11395e).f11271a;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f11392b;
                pi.o oVar = pi.o.f13011a;
                if (i11 == 0) {
                    uk.c.R(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        Object obj3 = this.f11396f;
                        try {
                            p5.e eVar = p5.e.f12801a;
                            r0 r0Var = new r0(fileOutputStream3);
                            this.f11393c = fileOutputStream3;
                            this.f11394d = fileOutputStream3;
                            this.f11392b = 1;
                            eVar.b(obj3, r0Var);
                            if (oVar == aVar2) {
                                return aVar2;
                            }
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th3) {
                            fileOutputStream = fileOutputStream3;
                            th2 = th3;
                            throw th2;
                        }
                    } catch (Exception e10) {
                        if (e10 instanceof FileNotFoundException) {
                            throw x8.a.Z(file.getParent(), (FileNotFoundException) e10);
                        }
                        throw e10;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = (FileOutputStream) this.f11394d;
                    fileOutputStream = (FileOutputStream) this.f11393c;
                    try {
                        uk.c.R(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th2;
                        } catch (Throwable th5) {
                            u6.v.n(fileOutputStream, th2);
                            throw th5;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                u6.v.n(fileOutputStream, null);
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i0 i0Var, Object obj, ti.c cVar) {
        super(1, cVar);
        this.f11395e = i0Var;
        this.f11396f = obj;
    }
}
