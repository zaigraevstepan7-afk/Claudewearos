package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 extends t0 {
    public final int F;
    public final int G;
    public g1 H;
    public l.i I;

    public j1(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.F = 21;
            this.G = 22;
        } else {
            this.F = 22;
            this.G = 21;
        }
    }

    @Override // m.t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.f fVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.H != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                fVar = (l.f) headerViewListAdapter.getWrappedAdapter();
            } else {
                fVar = (l.f) adapter;
                headersCount = 0;
            }
            l.i iVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= fVar.getCount()) ? null : fVar.getItem(i10);
            l.i iVar = this.I;
            if (iVar != iVarB) {
                l.h hVar = fVar.f9769a;
                if (iVar != null) {
                    this.H.a(hVar, iVar);
                }
                this.I = iVarB;
                if (iVarB != null) {
                    this.H.f(hVar, iVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.F) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.G) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.f) adapter).f9769a.c(false);
        return true;
    }

    public void setHoverListener(g1 g1Var) {
        this.H = g1Var;
    }

    @Override // m.t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
