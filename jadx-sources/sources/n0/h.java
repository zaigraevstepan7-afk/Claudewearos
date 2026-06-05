package n0;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public final TextClassification f11852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11853c;

    public h(Object obj, TextClassification textClassification, int i10) {
        super(obj);
        this.f11852b = textClassification;
        this.f11853c = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f11840a);
        sb2.append(", textClassification=");
        sb2.append(this.f11852b);
        sb2.append(", index=");
        return m6.a.g(sb2, this.f11853c, ')');
    }
}
