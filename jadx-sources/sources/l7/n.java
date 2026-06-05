package l7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f1.h2;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.concurrent.ScheduledExecutorService;
import t.m1;
import tj.r0;
import zf.j0;
import zf.q1;
import zf.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements o, kg.e, OnFailureListener, OnCompleteListener, uf.b, t.w, h2, uf.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10056a;

    public /* synthetic */ n(int i10) {
        this.f10056a = i10;
    }

    public static void g(w8.c cVar) {
        fj.l.f(cVar, "it");
    }

    @Override // uf.b
    public nf.b a(uf.p pVar) throws GeneralSecurityException {
        of.j jVar;
        of.j jVar2;
        switch (this.f10056a) {
            case 12:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    zf.r rVarD = zf.r.D((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (rVarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    of.j jVar3 = of.j.f12459e;
                    int size = rVarD.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iY = rVarD.A().y();
                    if (iY != 12 && iY != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY)));
                    }
                    q1 q1Var = (q1) pVar.f17056e;
                    int iOrdinal = q1Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar3 = of.j.f12457c;
                    } else if (iOrdinal == 2) {
                        jVar3 = of.j.f12458d;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.b());
                        }
                        jVar3 = of.j.f12458d;
                    }
                    of.k kVar = new of.k(size, iY, 16, jVar3);
                    ac.d dVar = new ac.d(27, false);
                    dVar.f374c = null;
                    dVar.f375d = null;
                    dVar.f373b = kVar;
                    dVar.f374c = new d8.e(bg.a.a(rVarD.z().x()));
                    dVar.f375d = (Integer) pVar.f17057f;
                    return dVar.b();
                } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 13:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    zf.x xVarB = zf.x.B((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (xVarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    of.j jVar4 = of.j.f12462h;
                    int size2 = xVarB.y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    q1 q1Var2 = (q1) pVar.f17056e;
                    int iOrdinal2 = q1Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        jVar4 = of.j.f12460f;
                    } else if (iOrdinal2 == 2) {
                        jVar4 = of.j.f12461g;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var2.b());
                        }
                        jVar4 = of.j.f12461g;
                    }
                    of.n nVar = new of.n(size2, 12, 16, jVar4);
                    ac.d dVar2 = new ac.d(28, false);
                    dVar2.f374c = null;
                    dVar2.f375d = null;
                    dVar2.f373b = nVar;
                    dVar2.f374c = new d8.e(bg.a.a(xVarB.y().x()));
                    dVar2.f375d = (Integer) pVar.f17057f;
                    return dVar2.c();
                } catch (com.google.crypto.tink.shaded.protobuf.c0 unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 14:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    zf.b0 b0VarB = zf.b0.B((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (b0VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    of.j jVar5 = of.j.f12464k;
                    int size3 = b0VarB.y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    q1 q1Var3 = (q1) pVar.f17056e;
                    int iOrdinal3 = q1Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        jVar5 = of.j.f12463i;
                    } else if (iOrdinal3 == 2) {
                        jVar5 = of.j.j;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var3.b());
                        }
                        jVar5 = of.j.j;
                    }
                    of.q qVar = new of.q(size3, jVar5);
                    ac.d dVar3 = new ac.d(29, false);
                    dVar3.f374c = null;
                    dVar3.f375d = null;
                    dVar3.f373b = qVar;
                    dVar3.f374c = new d8.e(bg.a.a(b0VarB.y().x()));
                    dVar3.f375d = (Integer) pVar.f17057f;
                    return dVar3.d();
                } catch (com.google.crypto.tink.shaded.protobuf.c0 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 15:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    j0 j0VarB = j0.B((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (j0VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    q1 q1Var4 = (q1) pVar.f17056e;
                    int iOrdinal4 = q1Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        jVar = of.j.f12465l;
                    } else if (iOrdinal4 == 2) {
                        jVar = of.j.f12466m;
                    } else if (iOrdinal4 == 3) {
                        jVar = of.j.f12467n;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var4.b());
                        }
                        jVar = of.j.f12466m;
                    }
                    return of.s.b(jVar, new d8.e(bg.a.a(j0VarB.y().x())), (Integer) pVar.f17057f);
                } catch (com.google.crypto.tink.shaded.protobuf.c0 unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 16:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    t1 t1VarB = t1.B((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (t1VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    q1 q1Var5 = (q1) pVar.f17056e;
                    int iOrdinal5 = q1Var5.ordinal();
                    if (iOrdinal5 == 1) {
                        jVar2 = of.j.f12468o;
                    } else if (iOrdinal5 == 2) {
                        jVar2 = of.j.f12469p;
                    } else if (iOrdinal5 == 3) {
                        jVar2 = of.j.f12470q;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var5.b());
                        }
                        jVar2 = of.j.f12469p;
                    }
                    return of.w.b(jVar2, new d8.e(bg.a.a(t1VarB.y().x())), (Integer) pVar.f17057f);
                } catch (com.google.crypto.tink.shaded.protobuf.c0 unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            default:
                if (!((String) pVar.f17052a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    zf.b bVarD = zf.b.D((com.google.crypto.tink.shaded.protobuf.i) pVar.f17054c, com.google.crypto.tink.shaded.protobuf.o.a());
                    if (bVarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p1.l lVar = new p1.l(16, false);
                    lVar.f12660b = null;
                    lVar.f12661c = null;
                    lVar.f12662d = vf.c.f18028f;
                    lVar.E(bVarD.z().size());
                    int iY2 = bVarD.A().y();
                    if (iY2 < 10 || 16 < iY2) {
                        throw new GeneralSecurityException(m6.a.d(iY2, "Invalid tag size for AesCmacParameters: "));
                    }
                    lVar.f12661c = Integer.valueOf(iY2);
                    lVar.f12662d = vf.e.a((q1) pVar.f17056e);
                    vf.d dVarH = lVar.h();
                    p1.l lVar2 = new p1.l(15, false);
                    lVar2.f12661c = null;
                    lVar2.f12662d = null;
                    lVar2.f12660b = dVarH;
                    lVar2.f12661c = new d8.e(bg.a.a(bVarD.z().x()));
                    lVar2.f12662d = (Integer) pVar.f17057f;
                    return lVar2.g();
                } catch (com.google.crypto.tink.shaded.protobuf.c0 | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
        }
    }

    @Override // f1.h2
    public boolean b() {
        return false;
    }

    @Override // t.w
    public float c(float f10) {
        float f11;
        float f12;
        switch (this.f10056a) {
            case 18:
                if (f10 < 0.36363637f) {
                    return 7.5625f * f10 * f10;
                }
                if (f10 < 0.72727275f) {
                    float f13 = f10 - 0.54545456f;
                    f11 = 7.5625f * f13 * f13;
                    f12 = 0.75f;
                } else if (f10 < 0.90909094f) {
                    float f14 = f10 - 0.8181818f;
                    f11 = 7.5625f * f14 * f14;
                    f12 = 0.9375f;
                } else {
                    float f15 = f10 - 0.95454544f;
                    f11 = 7.5625f * f15 * f15;
                    f12 = 0.984375f;
                }
                return f11 + f12;
            default:
                return f10;
        }
    }

    @Override // l7.o
    public void d(m mVar, p pVar, boolean z2) {
        mVar.e();
    }

    @Override // uf.m
    public Object e(nf.b bVar) throws GeneralSecurityException {
        wf.a aVar = new wf.a();
        if (gk.b.a(1)) {
            return aVar;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // kg.e
    public Object f(uf.p pVar) {
        switch (this.f10056a) {
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4272a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4274c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4273b.get();
            case 4:
                kg.n nVar = ExecutorsRegistrar.f4272a;
                return lg.l.f10970a;
            case 5:
                return DatabaseRegistrar.lambda$getComponents$0(pVar);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(pVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        fj.l.f(task, "it");
        nb.o oVar = nb.o.f12026a;
        nb.o.g();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f10056a) {
            case 6:
                fj.l.f(exc, "it");
                r0 r0Var = nb.o.f12033h;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.k(null, bool);
                break;
            case 7:
                fj.l.f(exc, "e");
                r0 r0Var2 = nb.o.f12042r;
                nb.w wVar = new nb.w(m1.i("Integrity check failed: ", exc.getMessage()));
                r0Var2.getClass();
                r0Var2.k(null, wVar);
                break;
            case 8:
                fj.l.f(exc, "e");
                r0 r0Var3 = nb.o.f12042r;
                nb.w wVar2 = new nb.w(m1.i("Verification failed: ", exc.getMessage()));
                r0Var3.getClass();
                r0Var3.k(null, wVar2);
                break;
            default:
                fj.l.f(exc, "it");
                r0 r0Var4 = nb.o.f12033h;
                Boolean bool2 = Boolean.FALSE;
                r0Var4.getClass();
                r0Var4.k(null, bool2);
                break;
        }
    }
}
