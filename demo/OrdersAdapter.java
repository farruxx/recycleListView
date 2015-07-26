import android.content.Context;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Farrux on 24.06.2015.
 */
public class OrdersAdapter extends RecycleAdapter<Order, BottomOrderHolder>{
    public OrdersAdapter(Context context, List<Order> items) {
        super(context, items, OrderHolder.class);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.order_item;
    }

    @Override
    protected void initValues(Order order, BottomOrderHolder holder, int position) {
		holder.setSomeFiled(order.getSomeValue);
    }
}
