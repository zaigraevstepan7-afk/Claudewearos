package ah;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final ag.a f459b = new ag.a(4);

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f460a;

    static {
        new ag.a(5);
    }

    @Override // ah.b
    public final boolean a(byte[] bArr) {
        String string;
        try {
            string = ((CharsetDecoder) f459b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            string = null;
        }
        if (string == null) {
            return false;
        }
        this.f460a.append(string);
        return true;
    }

    @Override // ah.b
    public final g b() {
        String string = this.f460a.toString();
        g gVar = new g();
        gVar.f477a = string;
        return gVar;
    }
}
