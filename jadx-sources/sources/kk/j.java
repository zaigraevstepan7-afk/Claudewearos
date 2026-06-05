package kk;

import java.util.concurrent.locks.ReentrantLock;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f9704a;

    /* renamed from: b, reason: collision with root package name */
    public long f9705b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9706c;

    public j(p pVar, long j) {
        this.f9704a = pVar;
        this.f9705b = j;
    }

    @Override // kk.c0
    public final long A(long j, f fVar) {
        long j4;
        long j10;
        int i10;
        fj.l.f(fVar, "sink");
        if (this.f9706c) {
            throw new IllegalStateException("closed");
        }
        p pVar = this.f9704a;
        long j11 = this.f9705b;
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
        }
        long j12 = j + j11;
        long j13 = j11;
        while (true) {
            if (j13 >= j12) {
                j4 = -1;
                break;
            }
            y yVarP = fVar.P(1);
            byte[] bArr = yVarP.f9741a;
            int i11 = yVarP.f9743c;
            j4 = -1;
            int iMin = (int) Math.min(j12 - j13, 8192 - i11);
            synchronized (pVar) {
                fj.l.f(bArr, "array");
                pVar.f9723d.seek(j13);
                i10 = 0;
                while (true) {
                    if (i10 >= iMin) {
                        break;
                    }
                    int i12 = pVar.f9723d.read(bArr, i11, iMin - i10);
                    if (i12 != -1) {
                        i10 += i12;
                    } else if (i10 == 0) {
                        i10 = -1;
                    }
                }
            }
            if (i10 == -1) {
                if (yVarP.f9742b == yVarP.f9743c) {
                    fVar.f9694a = yVarP.a();
                    z.a(yVarP);
                }
                if (j11 == j13) {
                    j10 = -1;
                }
            } else {
                yVarP.f9743c += i10;
                long j14 = i10;
                j13 += j14;
                fVar.f9695b += j14;
            }
        }
        j10 = j13 - j11;
        if (j10 != j4) {
            this.f9705b += j10;
        }
        return j10;
    }

    @Override // kk.c0
    public final e0 a() {
        return e0.f9690d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p pVar = this.f9704a;
        if (this.f9706c) {
            return;
        }
        this.f9706c = true;
        ReentrantLock reentrantLock = pVar.f9722c;
        reentrantLock.lock();
        try {
            int i10 = pVar.f9721b - 1;
            pVar.f9721b = i10;
            if (i10 == 0) {
                if (pVar.f9720a) {
                    synchronized (pVar) {
                        pVar.f9723d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
