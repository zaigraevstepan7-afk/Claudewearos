package dk;

import java.io.IOException;
import java.net.ProtocolException;
import kk.c0;
import kk.l;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends l {

    /* renamed from: b, reason: collision with root package name */
    public final long f5154b;

    /* renamed from: c, reason: collision with root package name */
    public long f5155c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f5158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, c0 c0Var, long j) {
        super(c0Var);
        this.f5158f = sVar;
        this.f5154b = j;
        if (j == 0) {
            b(null);
        }
    }

    @Override // kk.l, kk.c0
    public final long A(long j, kk.f fVar) throws IOException {
        if (this.f5157e) {
            throw new IllegalStateException("closed");
        }
        try {
            long jA = this.f9709a.A(j, fVar);
            if (jA == -1) {
                b(null);
                return -1L;
            }
            long j4 = this.f5155c + jA;
            long j10 = this.f5154b;
            if (j10 == -1 || j4 <= j10) {
                this.f5155c = j4;
                if (j4 == j10) {
                    b(null);
                }
                return jA;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j4);
        } catch (IOException e10) {
            throw b(e10);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f5156d) {
            return iOException;
        }
        this.f5156d = true;
        return this.f5158f.e(true, false, iOException);
    }

    @Override // kk.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5157e) {
            return;
        }
        this.f5157e = true;
        try {
            super.close();
            b(null);
        } catch (IOException e10) {
            throw b(e10);
        }
    }
}
