package kk;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements g {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9734a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9735b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9736c;

    public v(b0 b0Var) {
        fj.l.f(b0Var, "sink");
        this.f9734a = b0Var;
        this.f9735b = new f();
    }

    @Override // kk.g
    public final g G(String str) {
        fj.l.f(str, "string");
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.h0(str);
        b();
        return this;
    }

    @Override // kk.g
    public final g L(long j) {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.Z(j);
        b();
        return this;
    }

    @Override // kk.b0
    public final void Y(long j, f fVar) {
        fj.l.f(fVar, "source");
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.Y(j, fVar);
        b();
    }

    @Override // kk.b0
    public final e0 a() {
        return this.f9734a.a();
    }

    public final g b() {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f9735b;
        long j = fVar.f9695b;
        if (j == 0) {
            j = 0;
        } else {
            y yVar = fVar.f9694a;
            fj.l.c(yVar);
            y yVar2 = yVar.f9747g;
            fj.l.c(yVar2);
            if (yVar2.f9743c < 8192 && yVar2.f9745e) {
                j -= r6 - yVar2.f9742b;
            }
        }
        if (j > 0) {
            this.f9734a.Y(j, fVar);
        }
        return this;
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        b0 b0Var = this.f9734a;
        if (this.f9736c) {
            return;
        }
        try {
            f fVar = this.f9735b;
            long j = fVar.f9695b;
            if (j > 0) {
                b0Var.Y(j, fVar);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            b0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f9736c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // kk.g, kk.b0, java.io.Flushable
    public final void flush() {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f9735b;
        long j = fVar.f9695b;
        b0 b0Var = this.f9734a;
        if (j > 0) {
            b0Var.Y(j, fVar);
        }
        b0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9736c;
    }

    public final String toString() {
        return "buffer(" + this.f9734a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        fj.l.f(byteBuffer, "source");
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f9735b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // kk.g
    public final g writeByte(int i10) {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.W(i10);
        b();
        return this;
    }

    @Override // kk.g
    public final g writeInt(int i10) {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.e0(i10);
        b();
        return this;
    }

    @Override // kk.g
    public final g writeShort(int i10) {
        if (this.f9736c) {
            throw new IllegalStateException("closed");
        }
        this.f9735b.f0(i10);
        b();
        return this;
    }

    @Override // kk.g
    public final g write(byte[] bArr) {
        if (!this.f9736c) {
            this.f9735b.m6write(bArr);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
