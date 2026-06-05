package ck;

import ak.b0;
import ak.c;
import ak.l;
import ak.o;
import ak.r;
import ak.s;
import ak.u;
import ak.w;
import ak.x;
import ak.y;
import ak.z;
import bk.d;
import dk.g;
import dk.k;
import ek.b;
import ek.e;
import ek.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import kk.v;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3388a;

    public /* synthetic */ a(int i10) {
        this.f3388a = i10;
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static z c(z zVar) {
        if (zVar == null || zVar.f763z == null) {
            return zVar;
        }
        y yVarE = zVar.e();
        yVarE.f751g = null;
        return yVarE.a();
    }

    @Override // ak.o
    public final z a(e eVar) throws Throwable {
        boolean z2;
        y yVarM;
        boolean z10;
        switch (this.f3388a) {
            case 0:
                System.currentTimeMillis();
                w wVar = eVar.f6089e;
                Throwable th2 = null;
                j jVar = new j(6, wVar, null);
                if (wVar != null) {
                    c cVarA = wVar.f740f;
                    if (cVarA == null) {
                        cVarA = c.a(wVar.f737c);
                        wVar.f740f = cVarA;
                    }
                    if (cVarA.j) {
                        jVar = new j(6, null, null);
                    }
                }
                w wVar2 = (w) jVar.f15363b;
                z zVar = (z) jVar.f15364c;
                if (wVar2 == null && zVar == null) {
                    y yVar = new y();
                    yVar.f745a = eVar.f6089e;
                    yVar.f746b = s.HTTP_1_1;
                    yVar.f747c = 504;
                    yVar.f748d = "Unsatisfiable Request (only-if-cached)";
                    yVar.f751g = d.f1788d;
                    yVar.f754k = -1L;
                    yVar.f755l = System.currentTimeMillis();
                    return yVar.a();
                }
                if (wVar2 == null) {
                    y yVarE = zVar.e();
                    z zVarC = c(zVar);
                    if (zVarC != null) {
                        y.b("cacheResponse", zVarC);
                    }
                    yVarE.f753i = zVarC;
                    return yVarE.a();
                }
                z zVarA = eVar.a(wVar2);
                if (zVar != null) {
                    if (zVarA.f759c == 304) {
                        y yVarE2 = zVar.e();
                        l lVar = zVar.f762f;
                        l lVar2 = zVarA.f762f;
                        ArrayList arrayList = new ArrayList(20);
                        int iF = lVar.f();
                        int i10 = 0;
                        while (i10 < iF) {
                            Throwable th3 = th2;
                            String strD = lVar.d(i10);
                            String strG = lVar.g(i10);
                            if ((!"Warning".equalsIgnoreCase(strD) || !strG.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strD) || "Content-Encoding".equalsIgnoreCase(strD) || "Content-Type".equalsIgnoreCase(strD) || !b(strD) || lVar2.c(strD) == null)) {
                                ak.j.f658c.getClass();
                                arrayList.add(strD);
                                arrayList.add(strG.trim());
                            }
                            i10++;
                            th2 = th3;
                        }
                        Throwable th4 = th2;
                        int iF2 = lVar2.f();
                        for (int i11 = 0; i11 < iF2; i11++) {
                            String strD2 = lVar2.d(i11);
                            if (!"Content-Length".equalsIgnoreCase(strD2) && !"Content-Encoding".equalsIgnoreCase(strD2) && !"Content-Type".equalsIgnoreCase(strD2) && b(strD2)) {
                                ak.j jVar2 = ak.j.f658c;
                                String strG2 = lVar2.g(i11);
                                jVar2.getClass();
                                arrayList.add(strD2);
                                arrayList.add(strG2.trim());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        yh.c cVar = new yh.c(2);
                        Collections.addAll((ArrayList) cVar.f20314b, strArr);
                        yVarE2.f750f = cVar;
                        yVarE2.f754k = zVarA.D;
                        yVarE2.f755l = zVarA.E;
                        z zVarC2 = c(zVar);
                        if (zVarC2 != null) {
                            y.b("cacheResponse", zVarC2);
                        }
                        yVarE2.f753i = zVarC2;
                        z zVarC3 = c(zVarA);
                        if (zVarC3 != null) {
                            y.b("networkResponse", zVarC3);
                        }
                        yVarE2.f752h = zVarC3;
                        yVarE2.a();
                        zVarA.f763z.close();
                        throw th4;
                    }
                    d.c(zVar.f763z);
                }
                y yVarE3 = zVarA.e();
                z zVarC4 = c(zVar);
                if (zVarC4 != null) {
                    y.b("cacheResponse", zVarC4);
                }
                yVarE3.f753i = zVarC4;
                z zVarC5 = c(zVarA);
                if (zVarC5 != null) {
                    y.b("networkResponse", zVarC5);
                }
                yVarE3.f752h = zVarC5;
                return yVarE3.a();
            case 1:
                w wVar3 = eVar.f6089e;
                k kVar = eVar.f6086b;
                boolean z11 = !wVar3.f736b.equals("GET");
                synchronized (kVar.f5202b) {
                    if (kVar.f5213n) {
                        throw new IllegalStateException("released");
                    }
                    if (kVar.j != null) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                }
                dk.d dVar = kVar.f5208h;
                r rVar = kVar.f5201a;
                dVar.getClass();
                int i12 = eVar.f6091g;
                int i13 = eVar.f6092h;
                int i14 = eVar.f6093i;
                rVar.getClass();
                try {
                    b bVarG = dVar.b(i12, i13, i14, rVar.M, z11).g(rVar, eVar);
                    u uVar = kVar.f5203c;
                    ak.j jVar3 = kVar.f5204d;
                    dk.d dVar2 = kVar.f5208h;
                    wh.s sVar = new wh.s();
                    sVar.f19379a = kVar;
                    sVar.f19380b = jVar3;
                    sVar.f19381c = dVar2;
                    sVar.f19382d = bVarG;
                    synchronized (kVar.f5202b) {
                        kVar.j = sVar;
                        kVar.f5210k = false;
                        kVar.f5211l = false;
                    }
                    return eVar.b(wVar3, kVar, sVar);
                } catch (g e10) {
                    synchronized (dVar.f5161c) {
                        dVar.f5166h = true;
                        throw e10;
                    }
                } catch (IOException e11) {
                    synchronized (dVar.f5161c) {
                        dVar.f5166h = true;
                        throw new g(e11);
                    }
                }
            default:
                wh.s sVar2 = eVar.f6087c;
                if (sVar2 == null) {
                    throw new IllegalStateException();
                }
                k kVar2 = (k) sVar2.f19379a;
                b bVar = (b) sVar2.f19382d;
                ak.j jVar4 = (ak.j) sVar2.f19380b;
                w wVar4 = eVar.f6089e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    jVar4.getClass();
                    bVar.g(wVar4);
                    String str = wVar4.f736b;
                    x xVar = wVar4.f738d;
                    if (!hj.a.F(str) || xVar == null) {
                        z2 = false;
                        kVar2.c(sVar2, true, false, null);
                        yVarM = null;
                        z10 = false;
                    } else {
                        if ("100-continue".equalsIgnoreCase(wVar4.f737c.c("Expect"))) {
                            try {
                                bVar.h();
                                jVar4.getClass();
                                yVarM = sVar2.m(true);
                                z10 = true;
                            } catch (IOException e12) {
                                jVar4.getClass();
                                sVar2.s(e12);
                                throw e12;
                            }
                        } else {
                            yVarM = null;
                            z10 = false;
                        }
                        if (yVarM == null) {
                            long j = xVar.f742b;
                            jVar4.getClass();
                            v vVarI = u6.v.i(new dk.b(sVar2, bVar.b(wVar4, j), j));
                            byte[] bArr = (byte[]) xVar.f744d;
                            int i15 = xVar.f742b;
                            fj.l.f(bArr, "source");
                            if (vVarI.f9736c) {
                                throw new IllegalStateException("closed");
                            }
                            vVarI.f9735b.Q(i15, bArr);
                            vVarI.b();
                            vVarI.close();
                            z2 = false;
                        } else {
                            z2 = false;
                            kVar2.c(sVar2, true, false, null);
                            if (bVar.f().f5174h == null) {
                                bVar.f().h();
                            }
                        }
                    }
                    try {
                        bVar.c();
                        if (!z10) {
                            jVar4.getClass();
                        }
                        if (yVarM == null) {
                            yVarM = sVar2.m(z2);
                        }
                        yVarM.f745a = wVar4;
                        yVarM.f749e = bVar.f().f5172f;
                        yVarM.f754k = jCurrentTimeMillis;
                        yVarM.f755l = System.currentTimeMillis();
                        z zVarA2 = yVarM.a();
                        int i16 = zVarA2.f759c;
                        if (i16 == 100) {
                            y yVarM2 = sVar2.m(false);
                            yVarM2.f745a = wVar4;
                            yVarM2.f749e = bVar.f().f5172f;
                            yVarM2.f754k = jCurrentTimeMillis;
                            yVarM2.f755l = System.currentTimeMillis();
                            zVarA2 = yVarM2.a();
                            i16 = zVarA2.f759c;
                        }
                        y yVarE4 = zVarA2.e();
                        try {
                            String strB = zVarA2.b("Content-Type");
                            long jD = bVar.d(zVarA2);
                            yVarE4.f751g = new f(strB, jD, u6.v.j(new dk.c(sVar2, bVar.a(zVarA2), jD)));
                            z zVarA3 = yVarE4.a();
                            b0 b0Var = zVarA3.f763z;
                            if ("close".equalsIgnoreCase(zVarA3.f757a.f737c.c("Connection")) || "close".equalsIgnoreCase(zVarA3.b("Connection"))) {
                                bVar.f().h();
                            }
                            if ((i16 != 204 && i16 != 205) || b0Var.e() <= 0) {
                                return zVarA3;
                            }
                            StringBuilder sbP = gk.b.p(i16, "HTTP ", " had non-zero Content-Length: ");
                            sbP.append(b0Var.e());
                            throw new ProtocolException(sbP.toString());
                        } catch (IOException e13) {
                            sVar2.s(e13);
                            throw e13;
                        }
                    } catch (IOException e14) {
                        sVar2.s(e14);
                        throw e14;
                    }
                } catch (IOException e15) {
                    jVar4.getClass();
                    sVar2.s(e15);
                    throw e15;
                }
        }
    }
}
