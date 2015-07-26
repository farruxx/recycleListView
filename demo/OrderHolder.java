
import android.view.View;
import android.widget.TextView;


import butterknife.InjectView;

/**
 * Created by Farrux on 24.06.2015.
 */
public class OrderHolder extends RecycleViewHolder{
    public View view;

  
    @InjectView(R.id.orderArrivingTime)
    public TextView someText;

    public OrderHolder(View view) {
        super(view);
        this.view = view;
    }
}
