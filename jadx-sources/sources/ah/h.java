package ah;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import pg.v;
import t.m1;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f478a;

    /* renamed from: b, reason: collision with root package name */
    public e f479b;

    /* renamed from: c, reason: collision with root package name */
    public j f480c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f481d;

    /* renamed from: e, reason: collision with root package name */
    public b f482e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f483f;

    public static long b(byte[] bArr) {
        return (bArr[2] << 56) + ((bArr[3] & 255) << 48) + ((bArr[4] & 255) << 40) + ((bArr[5] & 255) << 32) + ((bArr[6] & 255) << 24) + ((bArr[7] & 255) << 16) + ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z2, byte b10, byte[] bArr) {
        c cVar;
        if (b10 == 9) {
            if (!z2) {
                throw new f("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new f("PING frame too long");
            }
            e eVar = this.f479b;
            synchronized (eVar) {
                eVar.e((byte) 10, bArr);
            }
            return;
        }
        b bVar = this.f482e;
        if (bVar != null && b10 != 0) {
            throw new f("Failed to continue outstanding frame");
        }
        if (bVar == null && b10 == 0) {
            throw new f("Received continuing frame, but there's nothing to continue");
        }
        if (bVar == null) {
            if (b10 == 2) {
                a aVar = new a();
                aVar.f458b = 0;
                aVar.f457a = new ArrayList();
                cVar = aVar;
            } else {
                c cVar2 = new c();
                cVar2.f460a = new StringBuilder();
                cVar = cVar2;
            }
            this.f482e = cVar;
        }
        if (!this.f482e.a(bArr)) {
            throw new f("Failed to decode frame");
        }
        if (z2) {
            g gVarB = this.f482e.b();
            this.f482e = null;
            j jVar = this.f480c;
            jVar.getClass();
            String str = gVarB.f477a;
            v vVar = (v) jVar.f15364c;
            if (vVar.j.A()) {
                vVar.j.l(null, m1.i("ws message: ", str), new Object[0]);
            }
            vVar.f12966i.execute(new a8.e(16, jVar, str));
        }
    }

    public final void c() throws IOException {
        byte[] bArr;
        byte b10;
        boolean z2;
        long jB;
        this.f480c = this.f479b.f469c;
        while (!this.f483f) {
            try {
                this.f478a.readFully(this.f481d, 0, 1);
                bArr = this.f481d;
                b10 = bArr[0];
                z2 = (b10 & 128) != 0;
            } catch (f e10) {
                this.f483f = true;
                e eVar = this.f479b;
                eVar.f469c.q(e10);
                if (eVar.f467a == 3) {
                    eVar.a();
                }
                eVar.b();
            } catch (SocketTimeoutException unused) {
            } catch (IOException e11) {
                f fVar = new f("IO Error", e11);
                this.f483f = true;
                e eVar2 = this.f479b;
                eVar2.f469c.q(fVar);
                if (eVar2.f467a == 3) {
                    eVar2.a();
                }
                eVar2.b();
            }
            if ((b10 & 112) != 0) {
                throw new f("Invalid frame received");
            }
            byte b11 = (byte) (b10 & 15);
            this.f478a.readFully(bArr, 1, 1);
            byte[] bArr2 = this.f481d;
            byte b12 = bArr2[1];
            if (b12 < 126) {
                jB = b12;
            } else if (b12 == 126) {
                this.f478a.readFully(bArr2, 2, 2);
                byte[] bArr3 = this.f481d;
                jB = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b12 == Byte.MAX_VALUE) {
                this.f478a.readFully(bArr2, 2, 8);
                jB = b(this.f481d);
            } else {
                jB = 0;
            }
            int i10 = (int) jB;
            byte[] bArr4 = new byte[i10];
            this.f478a.readFully(bArr4, 0, i10);
            if (b11 == 8) {
                this.f479b.b();
            } else if (b11 != 10) {
                if (b11 != 1 && b11 != 2 && b11 != 9 && b11 != 0) {
                    throw new f("Unsupported opcode: " + ((int) b11));
                }
                a(z2, b11, bArr4);
            }
        }
    }
}
