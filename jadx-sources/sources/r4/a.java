package r4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13702e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f13703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13704b;

    /* renamed from: c, reason: collision with root package name */
    public int f13705c;

    /* renamed from: d, reason: collision with root package name */
    public char f13706d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f13702e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f13703a = charSequence;
        this.f13704b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f13705c - 1;
        CharSequence charSequence = this.f13703a;
        char cCharAt = charSequence.charAt(i10);
        this.f13706d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f13705c);
            this.f13705c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f13705c--;
        char c6 = this.f13706d;
        return c6 < '\u0700' ? f13702e[c6] : Character.getDirectionality(c6);
    }
}
