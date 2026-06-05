package aj;

import fj.l;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] b() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        l.e(bArr, "buf");
        return bArr;
    }
}
