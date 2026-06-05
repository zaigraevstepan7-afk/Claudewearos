package vf;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.c0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;
import kg.r;
import zf.q0;
import zf.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements uf.m, uf.b, Continuation, rb.e, kg.e, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18049a;

    public /* synthetic */ j(int i10) {
        this.f18049a = i10;
    }

    @Override // uf.b
    public nf.b a(uf.p pVar) throws GeneralSecurityException {
        if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            q0 q0VarE = q0.E((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
            if (q0VarE.C() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            a8.j jVar = new a8.j();
            jVar.f215a = null;
            jVar.f216b = null;
            jVar.f217c = null;
            jVar.f218d = c.f18036o;
            jVar.f215a = Integer.valueOf(q0VarE.A().size());
            jVar.f216b = Integer.valueOf(q0VarE.B().A());
            jVar.f217c = l.a(q0VarE.B().z());
            jVar.f218d = l.b((q1) pVar.f17056e);
            k kVarL = jVar.l();
            p1.l lVar = new p1.l(17, false);
            lVar.f12661c = null;
            lVar.f12662d = null;
            lVar.f12660b = kVarL;
            lVar.f12661c = new d8.e(bg.a.a(q0VarE.A().x()));
            lVar.f12662d = (Integer) pVar.f17057f;
            return lVar.i();
        } catch (c0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    @Override // rb.e
    public Object apply(Object obj) {
        xh.e eVar = (xh.e) obj;
        eVar.getClass();
        ac.d dVar = wh.o.f19369a;
        dVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dVar.e(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // uf.m
    public Object e(nf.b bVar) throws GeneralSecurityException {
        wf.a aVar = new wf.a();
        if (gk.b.b(2)) {
            return aVar;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // kg.e
    public Object f(uf.p pVar) {
        Set setG = pVar.g(r.a(yh.a.class));
        yh.c cVar = yh.c.f20312c;
        if (cVar == null) {
            synchronized (yh.c.class) {
                try {
                    cVar = yh.c.f20312c;
                    if (cVar == null) {
                        cVar = new yh.c(0);
                        yh.c.f20312c = cVar;
                    }
                } finally {
                }
            }
        }
        return new yh.b(setG, cVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.f18049a) {
            case 3:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f18049a) {
            case 8:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }
}
