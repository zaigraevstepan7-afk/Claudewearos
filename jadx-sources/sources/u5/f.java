package u5;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f16621a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void e(long j) throws IOException {
        int i10 = this.f16622b;
        if (i10 > j) {
            this.f16622b = 0;
            this.f16621a.reset();
        } else {
            j -= i10;
        }
        b((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f16621a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
