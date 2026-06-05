package gk;

import java.util.logging.Level;
import java.util.logging.Logger;
import kk.c0;
import kk.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk.h f7508a;

    /* renamed from: b, reason: collision with root package name */
    public int f7509b;

    /* renamed from: c, reason: collision with root package name */
    public byte f7510c;

    /* renamed from: d, reason: collision with root package name */
    public int f7511d;

    /* renamed from: e, reason: collision with root package name */
    public int f7512e;

    /* renamed from: f, reason: collision with root package name */
    public short f7513f;

    public s(kk.h hVar) {
        this.f7508a = hVar;
    }

    @Override // kk.c0
    public final long A(long j, kk.f fVar) {
        int i10;
        int i11;
        do {
            int i12 = this.f7512e;
            kk.h hVar = this.f7508a;
            if (i12 == 0) {
                hVar.skip(this.f7513f);
                this.f7513f = (short) 0;
                if ((this.f7510c & 4) == 0) {
                    i10 = this.f7511d;
                    int iT = t.t(hVar);
                    this.f7512e = iT;
                    this.f7509b = iT;
                    byte b10 = (byte) (hVar.readByte() & 255);
                    this.f7510c = (byte) (hVar.readByte() & 255);
                    Logger logger = t.f7514e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(g.a(true, this.f7511d, this.f7509b, b10, this.f7510c));
                    }
                    i11 = hVar.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    this.f7511d = i11;
                    if (b10 != 9) {
                        g.c("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                        throw null;
                    }
                }
            } else {
                long jA = hVar.A(Math.min(j, i12), fVar);
                if (jA != -1) {
                    this.f7512e = (int) (this.f7512e - jA);
                    return jA;
                }
            }
            return -1L;
        } while (i11 == i10);
        g.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f7508a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
