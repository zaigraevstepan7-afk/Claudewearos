package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f8989a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f8990b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f8991c;

    /* renamed from: d, reason: collision with root package name */
    public Resources f8992d;

    public final void a() {
        if (this.f8990b == null) {
            this.f8990b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8990b.setTo(theme);
            }
        }
        this.f8990b.applyStyle(this.f8989a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f8992d == null) {
            this.f8992d = super.getResources();
        }
        return this.f8992d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8991c == null) {
            this.f8991c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8991c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8990b;
        if (theme != null) {
            return theme;
        }
        if (this.f8989a == 0) {
            this.f8989a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f8990b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f8989a != i10) {
            this.f8989a = i10;
            a();
        }
    }
}
