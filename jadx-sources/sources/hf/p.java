package hf;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7934a;

    /* renamed from: b, reason: collision with root package name */
    public int f7935b;

    /* renamed from: c, reason: collision with root package name */
    public int f7936c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7937d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7938e;

    public /* synthetic */ p() {
        this.f7934a = 2;
    }

    public void a(int i10) {
        int i11 = this.f7935b;
        int i12 = this.f7936c;
        boolean z2 = false;
        if (i10 <= i12 && i11 <= i10) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbQ = gk.b.q("Invalid offset: ", i10, ". Valid range is [", i11, " , ");
        sbQ.append(i12);
        sbQ.append(']');
        m3.a.a(sbQ.toString());
    }

    public int b() {
        androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) this.f7938e;
        if (kVar == null) {
            return ((String) this.f7937d).length();
        }
        return (kVar.f954b - kVar.d()) + (((String) this.f7937d).length() - (this.f7936c - this.f7935b));
    }

    public boolean c(int i10) {
        CharSequence charSequence = (CharSequence) this.f7937d;
        int i11 = this.f7935b + 1;
        if (i10 > this.f7936c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10))) {
            int i12 = i10 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i12))) {
                if (!r5.k.d()) {
                    return false;
                }
                r5.k kVarA = r5.k.a();
                if (kVarA.c() != 1 || kVarA.b(charSequence, i12) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i10) {
        int i11 = this.f7935b + 1;
        if (i10 > this.f7936c || i11 > i10) {
            return false;
        }
        return wd.a.I(Character.codePointBefore((CharSequence) this.f7937d, i10));
    }

    public boolean e(int i10) {
        a(i10);
        if (!((BreakIterator) this.f7938e).isBoundary(i10)) {
            return false;
        }
        if (g(i10) && g(i10 - 1) && g(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= ((CharSequence) this.f7937d).length() - 1 || !(f(i10) || f(i10 + 1));
    }

    public boolean f(int i10) {
        CharSequence charSequence = (CharSequence) this.f7937d;
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (fj.l.b(unicodeBlockOf, unicodeBlock) && fj.l.b(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return fj.l.b(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && fj.l.b(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i10) {
        CharSequence charSequence = (CharSequence) this.f7937d;
        int i11 = this.f7935b;
        if (i10 >= this.f7936c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) && !Character.isSurrogate(charSequence.charAt(i10))) {
            if (!r5.k.d()) {
                return false;
            }
            r5.k kVarA = r5.k.a();
            if (kVarA.c() != 1 || kVarA.b(charSequence, i10) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i10) {
        int i11 = this.f7935b;
        if (i10 >= this.f7936c || i11 > i10) {
            return false;
        }
        return wd.a.I(Character.codePointAt((CharSequence) this.f7937d, i10));
    }

    public int i(int i10) {
        a(i10);
        int iFollowing = ((BreakIterator) this.f7938e).following(i10);
        return (g(iFollowing + (-1)) && g(iFollowing) && !f(iFollowing)) ? i(iFollowing) : iFollowing;
    }

    public int j(int i10) {
        a(i10);
        int iPreceding = ((BreakIterator) this.f7938e).preceding(i10);
        return (g(iPreceding) && c(iPreceding) && !f(iPreceding)) ? j(iPreceding) : iPreceding;
    }

    public void k(int i10, int i11, String str) {
        if (i10 > i11) {
            m3.a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            m3.a.a("start must be non-negative, but was " + i10);
        }
        androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) this.f7938e;
        if (kVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f7937d).length() - i11, 64);
            String str2 = (String) this.f7937d;
            int i12 = i10 - iMin;
            fj.l.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f7937d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            fj.l.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            androidx.datastore.preferences.protobuf.k kVar2 = new androidx.datastore.preferences.protobuf.k(3);
            kVar2.f954b = iMax;
            kVar2.f957e = cArr;
            kVar2.f955c = length;
            kVar2.f956d = i13;
            this.f7938e = kVar2;
            this.f7935b = i12;
            this.f7936c = i14;
            return;
        }
        int i15 = this.f7935b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > kVar.f954b - kVar.d()) {
            this.f7937d = toString();
            this.f7938e = null;
            this.f7935b = -1;
            this.f7936c = -1;
            k(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > kVar.d()) {
            int iD = length2 - kVar.d();
            int i18 = kVar.f954b;
            do {
                i18 *= 2;
            } while (i18 - kVar.f954b < iD);
            char[] cArr2 = new char[i18];
            qi.k.g0((char[]) kVar.f957e, cArr2, 0, 0, kVar.f955c);
            int i19 = kVar.f954b;
            int i20 = kVar.f956d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            qi.k.g0((char[]) kVar.f957e, cArr2, i22, i20, i21 + i20);
            kVar.f957e = cArr2;
            kVar.f954b = i18;
            kVar.f956d = i22;
        }
        int i23 = kVar.f955c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) kVar.f957e;
            qi.k.g0(cArr3, cArr3, kVar.f956d - i24, i17, i23);
            kVar.f955c = i16;
            kVar.f956d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iD2 = kVar.d() + i16;
            int iD3 = kVar.d() + i17;
            int i25 = kVar.f956d;
            char[] cArr4 = (char[]) kVar.f957e;
            qi.k.g0(cArr4, cArr4, kVar.f955c, i25, iD2);
            kVar.f955c += iD2 - i25;
            kVar.f956d = iD3;
        } else {
            kVar.f956d = kVar.d() + i17;
            kVar.f955c = i16;
        }
        str.getChars(0, str.length(), (char[]) kVar.f957e, kVar.f955c);
        kVar.f955c = str.length() + kVar.f955c;
    }

    public String toString() {
        switch (this.f7934a) {
            case 2:
                androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) this.f7938e;
                if (kVar == null) {
                    return (String) this.f7937d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f7937d, 0, this.f7935b);
                sb2.append((char[]) kVar.f957e, 0, kVar.f955c);
                char[] cArr = (char[]) kVar.f957e;
                int i10 = kVar.f956d;
                sb2.append(cArr, i10, kVar.f954b - i10);
                String str = (String) this.f7937d;
                sb2.append((CharSequence) str, this.f7936c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public p(CharSequence charSequence, int i10, Locale locale) {
        this.f7934a = 1;
        this.f7937d = charSequence;
        if (charSequence.length() < 0) {
            m3.a.a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            m3.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f7938e = wordInstance;
        this.f7935b = Math.max(0, -50);
        this.f7936c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new h3.c(charSequence, i10));
    }

    public p(q qVar, ac.d dVar) {
        this.f7934a = 0;
        this.f7937d = new SparseArray();
        this.f7938e = qVar;
        TypedArray typedArray = (TypedArray) dVar.f374c;
        this.f7935b = typedArray.getResourceId(28, 0);
        this.f7936c = typedArray.getResourceId(53, 0);
    }
}
