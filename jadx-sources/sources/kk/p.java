package kk;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9720a;

    /* renamed from: b, reason: collision with root package name */
    public int f9721b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f9722c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f9723d;

    public p(RandomAccessFile randomAccessFile) {
        this.f9723d = randomAccessFile;
    }

    public final j b(long j) {
        ReentrantLock reentrantLock = this.f9722c;
        reentrantLock.lock();
        try {
            if (this.f9720a) {
                throw new IllegalStateException("closed");
            }
            this.f9721b++;
            reentrantLock.unlock();
            return new j(this, j);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f9722c;
        reentrantLock.lock();
        try {
            if (this.f9720a) {
                return;
            }
            this.f9720a = true;
            if (this.f9721b != 0) {
                return;
            }
            synchronized (this) {
                this.f9723d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f9722c;
        reentrantLock.lock();
        try {
            if (this.f9720a) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f9723d.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
