package i3;

import java.text.BreakIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends uk.c {

    /* renamed from: d, reason: collision with root package name */
    public final BreakIterator f8341d;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f8341d = characterInstance;
    }

    @Override // uk.c
    public final int G(int i10) {
        return this.f8341d.following(i10);
    }

    @Override // uk.c
    public final int K(int i10) {
        return this.f8341d.preceding(i10);
    }
}
