package of;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends b {
    public static s b(j jVar, d8.e eVar, Integer num) throws GeneralSecurityException {
        bg.a aVar = (bg.a) eVar.f5001a;
        j jVar2 = j.f12467n;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f1773a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f1773a.length);
        }
        if (jVar == jVar2) {
            bg.a.a(new byte[0]);
        } else if (jVar == j.f12466m) {
            bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f12465l) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new s();
    }
}
