package fk;

import ak.n;
import ak.r;
import ak.s;
import ak.w;
import ak.y;
import ak.z;
import android.graphics.Canvas;
import android.text.TextUtils;
import c2.u;
import c2.v0;
import g3.n0;
import h3.i;
import h3.j;
import h3.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import kk.b0;
import kk.c0;
import kk.h;
import kk.v;
import kk.x;
import r3.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements ek.b {

    /* renamed from: a, reason: collision with root package name */
    public int f6825a;

    /* renamed from: b, reason: collision with root package name */
    public long f6826b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6827c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6828d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6829e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6830f;

    public g(r rVar, dk.e eVar, x xVar, v vVar) {
        this.f6825a = 0;
        this.f6826b = 262144L;
        this.f6827c = rVar;
        this.f6828d = eVar;
        this.f6829e = xVar;
        this.f6830f = vVar;
    }

    @Override // ek.b
    public c0 a(z zVar) {
        if (!ek.d.b(zVar)) {
            return m(0L);
        }
        if ("chunked".equalsIgnoreCase(zVar.b("Transfer-Encoding"))) {
            n nVar = zVar.f757a.f735a;
            if (this.f6825a == 4) {
                this.f6825a = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException("state: " + this.f6825a);
        }
        long jA = ek.d.a(zVar);
        if (jA != -1) {
            return m(jA);
        }
        if (this.f6825a == 4) {
            this.f6825a = 5;
            ((dk.e) this.f6828d).h();
            return new f(this);
        }
        throw new IllegalStateException("state: " + this.f6825a);
    }

    @Override // ek.b
    public b0 b(w wVar, long j) {
        ak.x xVar = wVar.f738d;
        if ("chunked".equalsIgnoreCase(wVar.f737c.c("Transfer-Encoding"))) {
            if (this.f6825a == 1) {
                this.f6825a = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.f6825a);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f6825a == 1) {
            this.f6825a = 2;
            return new e(this);
        }
        throw new IllegalStateException("state: " + this.f6825a);
    }

    @Override // ek.b
    public void c() {
        ((kk.g) this.f6830f).flush();
    }

    @Override // ek.b
    public void cancel() {
        dk.e eVar = (dk.e) this.f6828d;
        if (eVar != null) {
            bk.d.d(eVar.f5170d);
        }
    }

    @Override // ek.b
    public long d(z zVar) {
        if (!ek.d.b(zVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(zVar.b("Transfer-Encoding"))) {
            return -1L;
        }
        return ek.d.a(zVar);
    }

    @Override // ek.b
    public y e(boolean z2) {
        int i10 = this.f6825a;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f6825a);
        }
        try {
            String strU = ((h) this.f6829e).u(this.f6826b);
            this.f6826b -= strU.length();
            ak.x xVarJ = ak.x.j(strU);
            int i11 = xVarJ.f742b;
            y yVar = new y();
            yVar.f746b = (s) xVarJ.f743c;
            yVar.f747c = i11;
            yVar.f748d = (String) xVarJ.f744d;
            yVar.f750f = q().e();
            if (z2 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f6825a = 3;
                return yVar;
            }
            this.f6825a = 4;
            return yVar;
        } catch (EOFException e10) {
            dk.e eVar = (dk.e) this.f6828d;
            throw new IOException(m1.i("unexpected end of stream on ", eVar != null ? eVar.f5169c.f603a.f578a.k() : "unknown"), e10);
        }
    }

    @Override // ek.b
    public dk.e f() {
        return (dk.e) this.f6828d;
    }

    @Override // ek.b
    public void g(w wVar) {
        Proxy.Type type = ((dk.e) this.f6828d).f5169c.f604b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wVar.f736b);
        sb2.append(' ');
        n nVar = wVar.f735a;
        if (nVar.f673a.equals("https") || type != Proxy.Type.HTTP) {
            String str = nVar.f681i;
            int iIndexOf = str.indexOf(47, nVar.f673a.length() + 3);
            String strSubstring = str.substring(iIndexOf, bk.d.g(iIndexOf, str.length(), str, "?#"));
            String strE = nVar.e();
            if (strE != null) {
                strSubstring = strSubstring + '?' + strE;
            }
            sb2.append(strSubstring);
        } else {
            sb2.append(nVar);
        }
        sb2.append(" HTTP/1.1");
        r(wVar.f737c, sb2.toString());
    }

    @Override // ek.b
    public void h() {
        ((kk.g) this.f6830f).flush();
    }

    public j i(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        g3.v vVar;
        float fL = l();
        o3.c cVar = (o3.c) this.f6827c;
        o3.e eVar = cVar.f12401z;
        int i17 = cVar.E;
        h3.f fVar = cVar.B;
        n0 n0Var = cVar.f12396b;
        o3.a aVar = o3.b.f12394a;
        g3.x xVar = n0Var.f7153c;
        return new j(charSequence, fL, eVar, i10, truncateAt, i17, (xVar == null || (vVar = xVar.f7192b) == null) ? false : vVar.f7188a, i12, i14, i15, i16, i13, i11, fVar);
    }

    public float j() {
        return ((j) this.f6828d).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Type inference failed for: r13v26, types: [h3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k(b2.c r12, int r13, b0.b r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.g.k(b2.c, int, b0.b):long");
    }

    public float l() {
        return s3.a.h(this.f6826b);
    }

    public d m(long j) {
        if (this.f6825a == 4) {
            this.f6825a = 5;
            return new d(this, j);
        }
        throw new IllegalStateException("state: " + this.f6825a);
    }

    public void n(u uVar) {
        Canvas canvasA = c2.c.a(uVar);
        j jVar = (j) this.f6828d;
        if (jVar.f7605d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, l(), j());
        }
        int i10 = jVar.f7609h;
        if (canvasA.getClipBounds(jVar.f7616p)) {
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            ThreadLocal threadLocal = k.f7618a;
            Object iVar = threadLocal.get();
            if (iVar == null) {
                iVar = new i();
                threadLocal.set(iVar);
            }
            i iVar2 = (i) iVar;
            iVar2.f7601a = canvasA;
            try {
                jVar.f7607f.draw(iVar2);
                if (i10 != 0) {
                    canvasA.translate(0.0f, (-1) * i10);
                }
            } finally {
                iVar2.f7601a = null;
            }
        }
        if (jVar.f7605d) {
            canvasA.restore();
        }
    }

    public void o(u uVar, long j, v0 v0Var, l lVar, e2.e eVar) {
        o3.e eVar2 = ((o3.c) this.f6827c).f12401z;
        int i10 = eVar2.f12406c;
        eVar2.d(j);
        eVar2.f(v0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        n(uVar);
        eVar2.b(i10);
    }

    public void p(u uVar, c2.s sVar, float f10, v0 v0Var, l lVar, e2.e eVar) {
        o3.e eVar2 = ((o3.c) this.f6827c).f12401z;
        int i10 = eVar2.f12406c;
        float fL = l();
        float fJ = j();
        eVar2.c(sVar, (Float.floatToRawIntBits(fJ) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32), f10);
        eVar2.f(v0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        n(uVar);
        eVar2.b(i10);
    }

    public ak.l q() {
        yh.c cVar = new yh.c(2);
        while (true) {
            String strU = ((h) this.f6829e).u(this.f6826b);
            this.f6826b -= strU.length();
            if (strU.length() == 0) {
                return new ak.l(cVar);
            }
            ak.j.f658c.getClass();
            int iIndexOf = strU.indexOf(":", 1);
            if (iIndexOf != -1) {
                cVar.a(strU.substring(0, iIndexOf), strU.substring(iIndexOf + 1));
            } else if (strU.startsWith(":")) {
                cVar.a("", strU.substring(1));
            } else {
                cVar.a("", strU);
            }
        }
    }

    public void r(ak.l lVar, String str) {
        kk.g gVar = (kk.g) this.f6830f;
        if (this.f6825a != 0) {
            throw new IllegalStateException("state: " + this.f6825a);
        }
        gVar.G(str).G("\r\n");
        int iF = lVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            gVar.G(lVar.d(i10)).G(": ").G(lVar.g(i10)).G("\r\n");
        }
        gVar.G("\r\n");
        this.f6825a = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(o3.c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.g.<init>(o3.c, int, int, long):void");
    }
}
