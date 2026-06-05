package t5;

import android.text.Editable;
import r5.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15799a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f15800b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f15801c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f15801c;
        return cls != null ? new w(cls, charSequence) : super.newEditable(charSequence);
    }
}
