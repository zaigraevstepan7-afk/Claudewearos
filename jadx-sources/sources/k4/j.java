package k4;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f9435a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f9436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9437c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f9435a = colorStateList;
        this.f9436b = configuration;
        this.f9437c = theme == null ? 0 : theme.hashCode();
    }
}
