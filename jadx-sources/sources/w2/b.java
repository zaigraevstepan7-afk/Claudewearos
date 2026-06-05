package w2;

import java.text.BreakIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends pf.e {

    /* renamed from: e, reason: collision with root package name */
    public static b f18197e;

    /* renamed from: f, reason: collision with root package name */
    public static b f18198f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18199c;

    /* renamed from: d, reason: collision with root package name */
    public BreakIterator f18200d;

    @Override // pf.e
    public final int[] c(int i10) {
        switch (this.f18199c) {
            case 0:
                int length = e().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f18200d;
                    if (breakIterator == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f18200d;
                        if (breakIterator2 == null) {
                            fj.l.l("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return d(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f18200d;
                    if (breakIterator3 == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            default:
                if (e().length() <= 0 || i10 >= e().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!k(i10) && (!k(i10) || (i10 != 0 && k(i10 - 1)))) {
                    BreakIterator breakIterator4 = this.f18200d;
                    if (breakIterator4 == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f18200d;
                if (breakIterator5 == null) {
                    fj.l.l("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !j(iFollowing2)) {
                    return null;
                }
                return d(i10, iFollowing2);
        }
    }

    @Override // pf.e
    public final int[] h(int i10) {
        switch (this.f18199c) {
            case 0:
                int length = e().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f18200d;
                    if (breakIterator == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f18200d;
                        if (breakIterator2 == null) {
                            fj.l.l("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return d(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f18200d;
                    if (breakIterator3 == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            default:
                int length2 = e().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !k(i10 - 1) && !j(i10)) {
                    BreakIterator breakIterator4 = this.f18200d;
                    if (breakIterator4 == null) {
                        fj.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f18200d;
                if (breakIterator5 == null) {
                    fj.l.l("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !k(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !k(iPreceding2 - 1)) {
                    return d(iPreceding2, i10);
                }
                return null;
        }
    }

    public final void i(String str) {
        switch (this.f18199c) {
            case 0:
                this.f12879a = str;
                BreakIterator breakIterator = this.f18200d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    fj.l.l("impl");
                    throw null;
                }
            default:
                this.f12879a = str;
                BreakIterator breakIterator2 = this.f18200d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    fj.l.l("impl");
                    throw null;
                }
        }
    }

    public boolean j(int i10) {
        if (i10 <= 0 || !k(i10 - 1)) {
            return false;
        }
        return i10 == e().length() || !k(i10);
    }

    public boolean k(int i10) {
        if (i10 < 0 || i10 >= e().length()) {
            return false;
        }
        return Character.isLetterOrDigit(e().codePointAt(i10));
    }
}
