package h3;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f7583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7584b;

    /* renamed from: c, reason: collision with root package name */
    public int f7585c = 0;

    public c(CharSequence charSequence, int i10) {
        this.f7583a = charSequence;
        this.f7584b = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f7585c;
        if (i10 == this.f7584b) {
            return '\uffff';
        }
        return this.f7583a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f7585c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f7584b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f7585c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f7584b;
        if (i10 == 0) {
            this.f7585c = i10;
            return '\uffff';
        }
        int i11 = i10 - 1;
        this.f7585c = i11;
        return this.f7583a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f7585c + 1;
        this.f7585c = i10;
        int i11 = this.f7584b;
        if (i10 < i11) {
            return this.f7583a.charAt(i10);
        }
        this.f7585c = i11;
        return '\uffff';
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f7585c;
        if (i10 <= 0) {
            return '\uffff';
        }
        int i11 = i10 - 1;
        this.f7585c = i11;
        return this.f7583a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f7584b || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f7585c = i10;
        return current();
    }
}
