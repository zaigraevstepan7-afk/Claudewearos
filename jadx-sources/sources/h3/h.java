package h3;

import android.text.Layout;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f7599a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f7600b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (l.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (l.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f7599a = alignment;
        f7600b = alignment2;
    }
}
