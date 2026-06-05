package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final h f9769a;

    /* renamed from: b, reason: collision with root package name */
    public int f9770b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9772d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9773e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9774f;

    public f(h hVar, LayoutInflater layoutInflater, boolean z2, int i10) {
        this.f9772d = z2;
        this.f9773e = layoutInflater;
        this.f9769a = hVar;
        this.f9774f = i10;
        a();
    }

    public final void a() {
        h hVar = this.f9769a;
        i iVar = hVar.f9794t;
        if (iVar != null) {
            hVar.i();
            ArrayList arrayList = hVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((i) arrayList.get(i10)) == iVar) {
                    this.f9770b = i10;
                    return;
                }
            }
        }
        this.f9770b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i getItem(int i10) {
        ArrayList arrayListK;
        boolean z2 = this.f9772d;
        h hVar = this.f9769a;
        if (z2) {
            hVar.i();
            arrayListK = hVar.j;
        } else {
            arrayListK = hVar.k();
        }
        int i11 = this.f9770b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (i) arrayListK.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z2 = this.f9772d;
        h hVar = this.f9769a;
        if (z2) {
            hVar.i();
            arrayListK = hVar.j;
        } else {
            arrayListK = hVar.k();
        }
        return this.f9770b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f9773e.inflate(this.f9774f, viewGroup, false);
        }
        int i11 = getItem(i10).f9797b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f9797b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9769a.l() && i11 != i13) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        o oVar = (o) view;
        if (this.f9771c) {
            listMenuItemView.setForceShowIcon(true);
        }
        oVar.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
