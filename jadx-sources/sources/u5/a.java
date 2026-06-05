package u5;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f16619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16620b;

    public a(f fVar) {
        this.f16620b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j4 = this.f16619a;
            f fVar = this.f16620b;
            if (j4 != j) {
                if (j4 >= 0 && j >= j4 + fVar.f16621a.available()) {
                    return -1;
                }
                fVar.e(j);
                this.f16619a = j;
            }
            if (i11 > fVar.f16621a.available()) {
                i11 = fVar.f16621a.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f16619a += i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f16619a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
