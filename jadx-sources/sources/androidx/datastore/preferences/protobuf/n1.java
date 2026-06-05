package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.a f976a;

    static {
        f976a = (k1.f962e && k1.f961d && !c.a()) ? new l1(1) : new l1(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < '\u0080') {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < '\u0800') {
                i12 += ('\u007f' - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < '\u0800') {
                        i10 += ('\u007f' - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if ('\ud800' <= cCharAt2 && cCharAt2 <= '\udfff') {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new m1(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }
}
