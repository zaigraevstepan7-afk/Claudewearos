package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends h implements SubMenu {

    /* renamed from: w, reason: collision with root package name */
    public final h f9839w;

    /* renamed from: x, reason: collision with root package name */
    public final i f9840x;

    public r(Context context, h hVar, i iVar) {
        super(context);
        this.f9839w = hVar;
        this.f9840x = iVar;
    }

    @Override // l.h
    public final boolean d(i iVar) {
        return this.f9839w.d(iVar);
    }

    @Override // l.h
    public final boolean e(h hVar, MenuItem menuItem) {
        return super.e(hVar, menuItem) || this.f9839w.e(hVar, menuItem);
    }

    @Override // l.h
    public final boolean f(i iVar) {
        return this.f9839w.f(iVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9840x;
    }

    @Override // l.h
    public final h j() {
        return this.f9839w.j();
    }

    @Override // l.h
    public final boolean l() {
        return this.f9839w.l();
    }

    @Override // l.h
    public final boolean m() {
        return this.f9839w.m();
    }

    @Override // l.h
    public final boolean n() {
        return this.f9839w.n();
    }

    @Override // l.h, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f9839w.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9840x.setIcon(drawable);
        return this;
    }

    @Override // l.h, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f9839w.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        q(0, null, i10, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        q(i10, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f9840x.setIcon(i10);
        return this;
    }
}
